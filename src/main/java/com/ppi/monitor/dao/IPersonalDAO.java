/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao;

import com.ppi.monitor.model.Personal;
import java.util.List;

/**
 *
 * @author 57314
 */
public interface IPersonalDAO {

    List<Personal> listaPersonal();

    void crearPersonal(Personal personal);

    void actualizarPersonal(Personal personal);
    
    Personal buscarPersonal(int idPersonal);
    
    Personal bucarPersonalPorCedula(int documento);
}
