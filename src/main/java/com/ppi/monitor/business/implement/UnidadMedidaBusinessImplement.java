/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IUnidadMedidaBusiness;
import com.ppi.monitor.dao.IUnidadMedidaDAO;
import com.ppi.monitor.model.UnidadMedida;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class UnidadMedidaBusinessImplement implements IUnidadMedidaBusiness {

    @Autowired
    private IUnidadMedidaDAO unidadMedidaDAO;

    @Override
    public List<UnidadMedida> listaMedidasAlimento() {
        List<UnidadMedida> list = new ArrayList<>();
        try {
            list = unidadMedidaDAO.listaMedidasAlimento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
