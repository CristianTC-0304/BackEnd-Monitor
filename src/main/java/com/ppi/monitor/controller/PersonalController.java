/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.IPersonalBusiness;
import com.ppi.monitor.model.Personal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 57314
 */
@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class PersonalController {

    @Autowired
    private IPersonalBusiness personalBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/personal")
    public List<Personal> listaPersonal() {
        List<Personal> list = new ArrayList<>();
        try {
            list = personalBusiness.listaPersonal();
        } catch (Exception e) {
            throw new RuntimeException("Error listando las personal");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/personal")
    public String crearPersonal(@RequestBody Personal personal) {
        try {
            personalBusiness.crearPersonal(personal);
            mensaje = "{\"mensaje\":\"Persona guardado correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando personal");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/personal/{documento}")
    public Personal buscarPorCedula(@PathVariable("documento") int documento) {
        Personal personal = new Personal();
        try {
            personal = personalBusiness.buscarPorCedula(documento);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error buscando personal");
        }
        return personal;


    }

    @RequestMapping(method = RequestMethod.GET, value = "/personalId/{documento}")
    public Personal buscarPorId(@PathVariable("documento") int idPersonal) {
        try {
            return personalBusiness.buscarPorId(idPersonal);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error buscando personal");
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/personal/{idPersonal}")
    public String actaulizarEstado(@PathVariable("idPersonal") int idPersonal) {

        try {
            personalBusiness.actaulizarEstado(idPersonal);
            mensaje = "{\"mensaje\":\"Personal actualizado.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando personal");
        }
        return mensaje;
    }
}
