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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andreshincapie
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})

public class AveController {

    @Autowired
    private IAveBusiness aveBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/ave")
    public List<Ave> listaAve() {
        List<Ave> list = new ArrayList<>();
        try {
            list = aveBusiness.listaAve();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listado los tipos de ave");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ave")
    public String crearTipoAve(@RequestBody Ave ave) {
        try {
            aveBusiness.crearTipoAve(ave);
            mensaje = "Información ave guardado.";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando tipo de ave");
        }
        return mensaje;
    }

}
