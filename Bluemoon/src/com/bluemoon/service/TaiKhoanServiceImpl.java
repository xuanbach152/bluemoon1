/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.dao.TaiKhoanDAO;
import com.bluemoon.dao.TaiKhoanDAOImpl;
import com.bluemoon.model.TaiKhoan;
import java.util.List;

/**
 *
 * @author hi
 */
public class TaiKhoanServiceImpl implements TaiKhoanService {
    private TaiKhoanDAO taiKhoanDAO = null;

    public TaiKhoanServiceImpl() {
        taiKhoanDAO = new TaiKhoanDAOImpl();
    }

    @Override
    public TaiKhoan login(String tenDangNhap, String matKhau) {
        return taiKhoanDAO.login(tenDangNhap, matKhau);
    }
    
    @Override
    public List<TaiKhoan> getList() {
        return taiKhoanDAO.getList();
    }
    @Override
    public int CreateOrUpdate(TaiKhoan taiKhoan){
        return taiKhoanDAO.CreateOrUpdate(taiKhoan);
    }
    
    @Override
    public int Remove(TaiKhoan taiKhoan){
        return taiKhoanDAO.Remove(taiKhoan);
    }

}
