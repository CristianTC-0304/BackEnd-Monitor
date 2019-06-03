/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IPersonalBusiness;
import com.ppi.monitor.dao.IPersonalDAO;
import com.ppi.monitor.model.Personal;
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
public class PersonalBusinessImplement implements IPersonalBusiness {

    @Autowired
    private IPersonalDAO personalDAO;

    @Override
    public List<Personal> listaPersonal() {
        List<Personal> list = new ArrayList<>();
        try {
            list = personalDAO.listaPersonal();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado las personas");
        }
        return list;
    }

    @Override
    public void crearPersonal(Personal personal) {

        try {
            if (StringUtil.isNullOrEmpty(personal.getIdPersonal())) {
                personal.setEstado(1);
                personalDAO.crearPersonal(personal);
            } else {
                personalDAO.actualizarPersonal(personal);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando personal");
        }
    }

    @Override
    public Personal buscarPorCedula(int documento) {
        Personal personal = new Personal();
        try {
            personal = personalDAO.bucarPersonalPorCedula(documento);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado el personal");
        }
        return personal;
    }

    @Override
    public void actaulizarEstado(int idPersonal) {
        Personal personal = personalDAO.buscarPersonal(idPersonal);
        try {
            personal.setEstado(0);
            personalDAO.actualizarPersonal(personal);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando personal");
        }
    }

}
