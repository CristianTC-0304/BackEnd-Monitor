/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ImunicipioBusiness;
import com.ppi.monitor.dao.ImunicipioDAO;
import com.ppi.monitor.exception.MonitorExcepcion;
import com.ppi.monitor.model.Municipio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andreshincapie
 */
@Service
public class MunicipioBusinessImplement implements ImunicipioBusiness {
    
//Entre cada clase me muevo por las interfaces
    @Autowired
    private ImunicipioDAO muImunicipioDAO;

    @Override
    public List<Municipio> listaMunicipio() {
        List<Municipio> list = new ArrayList<>();
        try {
            list = muImunicipioDAO.listaMunicipio();
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }

}
