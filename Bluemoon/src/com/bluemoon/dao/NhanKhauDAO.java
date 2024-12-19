/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bluemoon.dao;

import com.bluemoon.model.NhanKhau;
import java.util.List;

/**
 *
 * @author hi
 */
public interface NhanKhauDAO {
    public List<NhanKhau> getList();
    
    public String CreateOrUpdate(NhanKhau nhanKhau);
    public String Remove(NhanKhau nhanKhau);
}
