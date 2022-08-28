package com.nhom7.quanlyluong;

import com.nhom7.quanlyluong.View.BaoTriThongTinChamCong.BaoTriThongTinChamCongUI;

import java.io.IOException;
import java.sql.SQLException;
public class QuanLyLuongThuong {
    public static void main(String[] args) throws IOException, SQLException {
        new BaoTriThongTinChamCongUI().onStartGUI();
    }
}
