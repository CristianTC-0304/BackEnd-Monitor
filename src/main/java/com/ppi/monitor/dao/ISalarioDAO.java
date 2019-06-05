/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao;

import com.ppi.monitor.model.Salario;
import java.util.List;

/**
 *
 * @author andreshincapie
 */
public interface ISalarioDAO {

    public List<Salario> listaSalario();

    void crearSalario(Salario salario);

    void actualizarSalario(Salario salario);

    Salario buscarSalario(int idSalario);
}
