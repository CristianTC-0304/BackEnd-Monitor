/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IPrecioAlimentoBusiness;
import com.ppi.monitor.dao.IPrecioAlimentoDAO;
import com.ppi.monitor.model.PrecioAlimento;
import com.ppi.monitor.util.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class PrecioAlimentoBusinessImplement implements IPrecioAlimentoBusiness {

    @Autowired
    private IPrecioAlimentoDAO precioAlimentoDAO;

    @Override
    public List<PrecioAlimento> listaAlimento() {
        List<PrecioAlimento> list = new ArrayList<>();
        try {
            list = precioAlimentoDAO.listaAlimento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void crearAlimento(PrecioAlimento alimento) {
        try {
            if (StringUtil.isNullOrEmpty(alimento.getIdprecioAlimento())) {
                alimento.setEstado(1);
                precioAlimentoDAO.crearAlimento(alimento);
            } else {
                precioAlimentoDAO.actualizarAlimento(alimento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
