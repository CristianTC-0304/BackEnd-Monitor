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
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 57314
 */
@RestController
@RequestMapping (value = "/monitor")
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
            mensaje = "{\"estado\":\"Información de alimento guardada.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando alimento");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/alimento/{idprecioAlimento}")
    public String cambiarEstadoAlimento(@PathVariable("idprecioAlimento") int idPrecioAlimento) {
        try {
            precioAlimentoBusiness.cambiarEstadoAlimento(idPrecioAlimento);
            mensaje = "{\"mensaje\":\"infromación de alimento actualizado.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando vacuna");
        }
        return mensaje;
    }


}
