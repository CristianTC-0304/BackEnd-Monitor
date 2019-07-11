/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao;

import com.ppi.monitor.model.Ave;
import java.util.List;

/**
 *
 * @author andreshincapie
 */
public interface IAveDAO {

    public List<Ave> listaAve();

    void crearTipoAve(Ave ave);

    void actualizarTipoAve(Ave ave);

    void eliminarAve(int idAve);
    
    

}
