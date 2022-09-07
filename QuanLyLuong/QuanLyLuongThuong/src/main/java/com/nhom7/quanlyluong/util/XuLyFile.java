package com.nhom7.quanlyluong.util;


import com.nhom7.quanlyluong.Model.TaiKhoan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Admin
 */
public class XuLyFile {
    private static final String DUONG_DAN_FILE = "saveData.txt";
    private static final String LUU_ID = "saveID.txt";
    private static final String LUU_TEN_TAIKHOAN = "saveAccountRegister.txt";

    public static void luuTaiKhoan(TaiKhoan taiKhoan) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DUONG_DAN_FILE))) {
            objectOutputStream.reset();
            objectOutputStream.writeObject(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static TaiKhoan layTaiKhoan() {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE))) {
            return (TaiKhoan) objectInputStream.readObject();
        } catch (
                Exception e) {
            return null;
        }
    }

    public static void luuIDTaiKhoan(int ID) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(LUU_ID))) {
            objectOutputStream.reset();
            objectOutputStream.writeInt(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int layIDTaiKhoan() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE))) {
            return objectInputStream.readInt();
        } catch (Exception e) {
            return -1;
        }
    }

    public static void LuuTenTenKhoan(String taiKhoan) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(LUU_TEN_TAIKHOAN))) {
            objectOutputStream.reset();
            objectOutputStream.writeObject(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String layTenTaiKhoan() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(LUU_TEN_TAIKHOAN))) {
            return (String) objectInputStream.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
