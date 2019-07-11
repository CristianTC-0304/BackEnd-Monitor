/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.IAveBusiness;
import com.ppi.monitor.model.Ave;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author andreshincapie
 */
@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AveController {

    @Autowired
    private IAveBusiness aveBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/ave")
    public List<Ave> listaAve() {

        try {
            return aveBusiness.listaAve();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listado los tipos de ave");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ave")
    public String crearTipoAve(@RequestBody Ave ave) {
        try {
            aveBusiness.crearTipoAve(ave);
            mensaje = "{\"mensaje\":\"Tipo ave guardada correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando tipo de ave");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/ave/{idAve}")
    public String eliminartipoAve(@PathVariable("idAve") int idAve) {
        try {
            aveBusiness.eliminarTipoAve(idAve);
            mensaje = "{\"mensaje\":\"Tipo ave eliminada correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando el tipo de ave");
        }
        return mensaje;
    }

}
