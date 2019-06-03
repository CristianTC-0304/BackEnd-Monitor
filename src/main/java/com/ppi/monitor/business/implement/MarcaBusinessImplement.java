/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IMarcaBusiness;
import com.ppi.monitor.dao.IMarcaDAO;
import com.ppi.monitor.model.Marca;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class MarcaBusinessImplement implements IMarcaBusiness {

    @Autowired
    private IMarcaDAO marcaDAO;

    @Override
    public List<Marca> listaDeMarcas() {
        List<Marca> list = new ArrayList<>();
        try {
            list = marcaDAO.listaDeMarcas();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
