/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.IDrogaVacunaBusiness;
import com.ppi.monitor.model.DrogaVacuna;
import java.util.ArrayList;
import java.util.List;

import com.ppi.monitor.model.Presentacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 57314
 */
@RestController
@RequestMapping (value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class DrogaVacunaController {

    @Autowired
    private IDrogaVacunaBusiness drogaVacunaBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/vacuna")
    public List<DrogaVacuna> listaVacunas() {
        List<DrogaVacuna> list = new ArrayList<>();
        try {
            list = drogaVacunaBusiness.listaVacunas();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando las vacunas");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/presentacion")
    public List<Presentacion> listaPresentacion() {
        List<Presentacion> list = new ArrayList<>();
        try {
            list = drogaVacunaBusiness.listaPresentacion();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando las vacunas");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/vacuna")
    public String crearVacuna(@RequestBody DrogaVacuna vacuna) {

        try {
            drogaVacunaBusiness.crearVacuna(vacuna);
            mensaje = "{\"mensaje\":\"Información de alimento guardada.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando vacuna");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/vacuna/{idDrogaVacuna}")
    public String cambiarEstadoVacuna(@PathVariable("idDrogaVacuna") int idDrogaVacuna) {
        try {
            drogaVacunaBusiness.cambiarEstadoVacuna(idDrogaVacuna);
           // mensaje = "infromación de alimento actualizado.";
            mensaje = "{\"mensaje\":\"infromación de vacuna actualizado.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando vacuna");
        }
        return mensaje;
    }
}
