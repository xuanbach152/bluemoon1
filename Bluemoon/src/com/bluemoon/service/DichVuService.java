/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.model.DichVu;
import java.util.List;

/**
 *
 * @author hi
 */
public interface DichVuService {
    public List<DichVu> getList();
    
    public String CreateOrUpdate(DichVu dichVu);
    public String Remove(DichVu dichVu);
}
