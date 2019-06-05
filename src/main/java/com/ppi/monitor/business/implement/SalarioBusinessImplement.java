/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.dao.ISalarioDAO;
import com.ppi.monitor.business.ISalarioBusiness;
import com.ppi.monitor.model.Salario;
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
public class SalarioBusinessImplement implements ISalarioBusiness {

    //@Autowired sirve para inyectar un Bean usando la autodetección de Spring
    @Autowired
    private ISalarioDAO salarioDAO;

    @Override
    public List<Salario> listaSalario() {
        List<Salario> list = new ArrayList<>();
        try {
            list = salarioDAO.listaSalario();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando los salarios.");
        }
        return list;

    }

    @Override
    public void guardarSalario(Salario salario) {
        Salario salarioActual = salario;
        try {
            if (StringUtil.isNullOrEmpty(salario.getIdsalario())) {
                
                salarioActual.setEstado(1);
                salarioDAO.crearSalario(salarioActual);
            } else {
                salarioDAO.actualizarSalario(salario);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando salario.");
        }
    }

    @Override
    public void cambiarEstadoSalario(int idSalario) {
        Salario alimento = salarioDAO.buscarSalario(idSalario);
        alimento.setEstado(0);
        try {
            salarioDAO.actualizarSalario(alimento);
        } catch (Exception e) {
        }
    }

}
