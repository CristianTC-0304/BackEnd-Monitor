/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business;

import com.ppi.monitor.model.Personal;
import java.util.List;

/**
 *
 * @author 57314
 */
public interface IPersonalBusiness {

    List<Personal> listaPersonal();

    void crearPersonal(Personal personal);

    void actaulizarEstado(int idPersonal);

    Personal buscarPorCedula(int documento);
}
