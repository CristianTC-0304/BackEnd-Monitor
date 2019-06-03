/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IDrogaVacunaBusiness;
import com.ppi.monitor.dao.IDrogaVacunaDAO;
import com.ppi.monitor.model.DrogaVacuna;
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
public class DrogaVacunaBusinessImplement implements IDrogaVacunaBusiness {

    @Autowired
    private IDrogaVacunaDAO drogaVacunaDAO;

    @Override
    public List<DrogaVacuna> listaVacunas() {
        List<DrogaVacuna> list = new ArrayList<>();
        try {
            list = drogaVacunaDAO.listaVacunas();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return list;
    }

    @Override
    public void crearVacuna(DrogaVacuna vacuna) {
        try {
            if (StringUtil.isNullOrEmpty(vacuna.getIdDrogaVacuna())) {
                vacuna.setEstado(1);
                drogaVacunaDAO.crearVacuna(vacuna);
            } else {
                drogaVacunaDAO.actualizarVacuna(vacuna);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando la vacuna");
        }
    }

    @Override
    public void cambiarEstadoVacuna(int idDrogaVacuna) {
        DrogaVacuna vacuna = drogaVacunaDAO.buscarVacuna(idDrogaVacuna);
        vacuna.setEstado(0);
        try {
            drogaVacunaDAO.actualizarVacuna(vacuna);
        } catch (Exception e) {
        }
    }

}
