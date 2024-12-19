/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bluemoon.service;
import com.bluemoon.model.HoGiaDinh;
import java.util.List;

/**
 *
 * @author hi
 */
public interface HoGiaDinhService {
    public List<HoGiaDinh> getList();
    
    public String CreateOrUpdate(HoGiaDinh hoGiaDinh);
    public String Remove(HoGiaDinh hoGiaDinh);
}
