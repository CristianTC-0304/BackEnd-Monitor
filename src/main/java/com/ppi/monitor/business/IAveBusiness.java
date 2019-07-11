/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business;

import com.ppi.monitor.model.Ave;
import java.util.List;

/**
 *
 * @author andreshincapie
 */
public interface IAveBusiness {

    public List<Ave> listaAve();

    void crearTipoAve(Ave ave);

    void eliminarTipoAve(int idAve);

}
