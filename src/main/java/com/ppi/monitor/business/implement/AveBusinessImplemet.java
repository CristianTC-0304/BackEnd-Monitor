/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IAveBusiness;
import com.ppi.monitor.dao.IAveDAO;
import com.ppi.monitor.model.Ave;
import com.ppi.monitor.util.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andreshincapie
 */
@Service
public class AveBusinessImplemet implements IAveBusiness {

    @Autowired
    private IAveDAO aveDAO;

    @Override
    public List<Ave> listaAve() {
        List<Ave> list = new ArrayList<>();
        try {
            list = aveDAO.listaAve();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listado tipos de ave.");
        }
        return list;

    }

    @Override
    public void crearTipoAve(Ave ave) {

        try {
            if (StringUtil.isNullOrEmpty(ave.getIdAve())) {
                aveDAO.crearTipoAve(ave);
            } else {
                aveDAO.actualizarTipoAve(ave);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando tipo de ave.");
        }
    }

    

}
