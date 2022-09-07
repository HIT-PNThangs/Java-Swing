/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom7.quanlyluong.Controller;

import com.nhom7.quanlyluong.Model.TaiKhoan;
import com.nhom7.quanlyluong.View.TrangChu.TrangChuAdmin.TrangChuAdminUI;
import com.nhom7.quanlyluong.View.TrangChu.TrangChuGiamDoc.TrangChuGiamDocUI;
import com.nhom7.quanlyluong.View.TrangChu.TrangChuKeToan.TrangChuKeToanUI;
import com.nhom7.quanlyluong.View.TrangChu.TrangChuNguoiDung.TrangChuNguoiDungUI;
import com.nhom7.quanlyluong.View.TrangChu.TrangChuNhanSu.TrangChuNhanSuUI;
import com.nhom7.quanlyluong.util.KetNoiCSDL;
import com.nhom7.quanlyluong.util.XuLyFile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;


/**
 * @author Admin
 */
public class DangNhapController {
    private static final String findExistUser = "select count(*) from TAIKHOAN where taikhoan = ? "
            + "and matkhau = ?";

    private static final String quyenNguoiDung = "select * from taikhoan where taikhoan = ? and matkhau = ?";

    public static String onLoginEvent(TaiKhoan taiKhoan) {
        try {
            Connection connection = KetNoiCSDL.getConnection();

            //Xử lý tìm tài khoản tồn tại
            PreparedStatement preparedStatement = connection.prepareStatement(findExistUser);
            preparedStatement.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement.setString(2, taiKhoan.getMatKhau());
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();//Chuyển con trỏ về bản ghi đầu
            int countRow = resultSet.getInt(1);

            if (countRow != 1) {
                throw new Exception("Tài Khoản Không Tồn Tại");
            }

            //Mở giao diện các theo quyền
            PreparedStatement preparedStatement1 = connection.prepareStatement(quyenNguoiDung);
            preparedStatement1.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement1.setString(2, taiKhoan.getMatKhau());

            ResultSet resultSet1 = preparedStatement1.executeQuery();
            resultSet1.next();

            int ID = resultSet1.getInt(1);
            XuLyFile.luuIDTaiKhoan(ID);
            String tenTaiKhoan = resultSet1.getString(2);
            int quyen = resultSet1.getInt(4);

            HashMap<String, Object> data = new HashMap<>();
            data.put("TenTaiKhoan", tenTaiKhoan);
            data.put("ID", ID);

            switch (quyen) {
                case 0:
                    TrangChuAdminUI trangChuAdminUI = new TrangChuAdminUI(data);
                    trangChuAdminUI.onStartGUI();
                    break;
                case 1:
                    TrangChuNguoiDungUI trangChuNguoiDungUI = new TrangChuNguoiDungUI(data);
                    trangChuNguoiDungUI.onStartGUI();
                    break;
                case 2:
                    TrangChuKeToanUI trangChuKeToanUI = new TrangChuKeToanUI(data);
                    trangChuKeToanUI.onStartGUI();
                    break;
                case 3:
                    TrangChuNhanSuUI trangChuNhanSuUI = new TrangChuNhanSuUI(data);
                    trangChuNhanSuUI.onStartGUI();
                    break;
                case 4:
                    TrangChuGiamDocUI trangChuGiamDocUI = new TrangChuGiamDocUI(data);
                    trangChuGiamDocUI.onStartGUI();
                    break;
            }

            return "Đăng Nhập Thành Công";
        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
