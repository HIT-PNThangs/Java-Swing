/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom7.quanlyluong.Model;

/**
 * @author Admin
 */
public class HocPhan extends BaseModel {
    private long maHocPhan;
    private String tenHocPhan;
    private int soTinChi;

    public HocPhan(String tenHocPhan, int soTinChi) {
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
    }

    public HocPhan() {
    }

    public long getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(long maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] objects = new Object[3];
        objects[0] = maHocPhan;
        objects[1] = tenHocPhan;
        objects[2] = soTinChi;
        return objects;
    }
}
