/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business;

import com.ppi.monitor.model.Salario;
import java.util.List;

/**
 *
 * @author andreshincapie
 */
public interface ISalarioBusiness {

    public List<Salario> listaSalario();

    void guardarSalario(Salario salario);
    void cambiarEstadoSalario(int idSalario);
}
