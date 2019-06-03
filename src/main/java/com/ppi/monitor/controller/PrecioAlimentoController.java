/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.IPrecioAlimentoBusiness;
import com.ppi.monitor.model.PrecioAlimento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 57314
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class PrecioAlimentoController {

    @Autowired
    private IPrecioAlimentoBusiness precioAlimentoBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/alimento")
    public List<PrecioAlimento> listaAlimento() {
        List<PrecioAlimento> list = new ArrayList<>();
        try {
            list = precioAlimentoBusiness.listaAlimento();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listado alimentos");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/alimento")
    public String crearAlimento(@RequestBody PrecioAlimento alimento) {
        try {
            precioAlimentoBusiness.crearAlimento(alimento);
            mensaje = "Información de alimento guardada.";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando alimento");
        }
        return mensaje;
    }

}
