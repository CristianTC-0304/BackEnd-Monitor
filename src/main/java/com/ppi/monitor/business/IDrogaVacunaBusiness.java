/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business;

import com.ppi.monitor.model.DrogaVacuna;
import com.ppi.monitor.model.Presentacion;
import java.util.List;

/**
 *
 * @author 57314
 */
public interface IDrogaVacunaBusiness {

    List<DrogaVacuna> listaVacunas();
    List<Presentacion> listaPresentacion();

    void crearVacuna(DrogaVacuna vacuna);
    
    void cambiarEstadoVacuna(int idDrogaVacuna);

}
