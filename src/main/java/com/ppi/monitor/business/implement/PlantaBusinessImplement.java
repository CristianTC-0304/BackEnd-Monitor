/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IPlantaBusiness;
import com.ppi.monitor.dao.IPlantaDAO;
import com.ppi.monitor.model.Planta;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class PlantaBusinessImplement implements IPlantaBusiness {

    @Autowired
    private IPlantaDAO plantaDAO;

    @Override
    public List<Planta> listaPlanta() {
        List<Planta> list = new ArrayList<>();
        try {
            list = plantaDAO.listaPlanta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
