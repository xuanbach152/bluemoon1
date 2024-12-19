/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.dao.HoGiaDinhDAO;
import com.bluemoon.dao.HoGiaDinhDAOImpl;
import com.bluemoon.model.HoGiaDinh;
import java.util.List;

/**
 *
 * @author hi
 */
public class HoGiaDinhServiceImpl implements HoGiaDinhService {
    private HoGiaDinhDAO hoGiaDinhDAO = null;

    public HoGiaDinhServiceImpl() {
        this.hoGiaDinhDAO = new HoGiaDinhDAOImpl();
    }
    @Override
    public List<HoGiaDinh> getList() {
        return hoGiaDinhDAO.getList();
    }
    @Override
    public String CreateOrUpdate(HoGiaDinh hoGiaDinh){
        return hoGiaDinhDAO.CreateOrUpdate(hoGiaDinh);
    }
    
    @Override
    public String Remove(HoGiaDinh hoGiaDinh){
        return hoGiaDinhDAO.Remove(hoGiaDinh);
    }
}
