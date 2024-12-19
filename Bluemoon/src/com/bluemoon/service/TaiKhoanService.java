/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.model.TaiKhoan;
import java.util.List;

/**
 *
 * @author hi
 */
public interface TaiKhoanService {
    public TaiKhoan login(String tenDangNhap, String matKhau);
    
    public List<TaiKhoan> getList();
    public int CreateOrUpdate(TaiKhoan taiKhoan);
    public int Remove(TaiKhoan taiKhoan);
}
