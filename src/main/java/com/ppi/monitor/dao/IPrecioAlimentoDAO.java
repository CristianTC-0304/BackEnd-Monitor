/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao;

import com.ppi.monitor.model.PrecioAlimento;
import java.util.List;

/**
 *
 * @author 57314
 */
public interface IPrecioAlimentoDAO {

    List<PrecioAlimento> listaAlimento();

    void crearAlimento(PrecioAlimento alimento);

    void actualizarAlimento(PrecioAlimento alimento);
    
}
