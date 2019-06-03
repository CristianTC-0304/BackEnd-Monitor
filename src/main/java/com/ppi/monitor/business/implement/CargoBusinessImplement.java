/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ICargoBusiness;
import com.ppi.monitor.dao.ICargoDAO;
import com.ppi.monitor.model.Cargo;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class CargoBusinessImplement implements ICargoBusiness {

    @Autowired
    private ICargoDAO cargoDAO;

    @Override
    public List<Cargo> listaCargo() {
        List<Cargo> list = new ArrayList<>();
        try {
            list = cargoDAO.listaCargo();
        } catch (Exception e) {

        }
        return list;
    }

}
