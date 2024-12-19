/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author hi
 */
public class HoGiaDinh implements Serializable {
    private String ma_hogd;
    private String ten_hogd;
    private String dia_chi;
    private int so_luong_nhan_khau;
    private int dien_tich;
    private Date ngay_thue;

    public String getMa_hogd() {
        return ma_hogd;
    }

    public void setMa_hogd(String ma_hogd) {
        this.ma_hogd = ma_hogd;
    }

    public String getTen_hogd() {
        return ten_hogd;
    }

    public void setTen_hogd(String ten_hogd) {
        this.ten_hogd = ten_hogd;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public int getSo_luong_nhan_khau() {
        return so_luong_nhan_khau;
    }

    public void setSo_luong_nhan_khau(int so_luong_nhan_khau) {
        this.so_luong_nhan_khau = so_luong_nhan_khau;
    }

    public int getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(int dien_tich) {
        this.dien_tich = dien_tich;
    }

    public Date getNgay_thue() {
        return ngay_thue;
    }

    public void setNgay_thue(Date ngay_thue) {
        this.ngay_thue = ngay_thue;
    }
    
    
    
}
