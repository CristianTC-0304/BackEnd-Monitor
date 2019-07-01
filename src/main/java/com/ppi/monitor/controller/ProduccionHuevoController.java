package com.ppi.monitor.controller;

import com.ppi.monitor.business.IProduccionHuevoBusiness;
import com.ppi.monitor.model.ProduccionHuevo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class ProduccionHuevoController {

    @Autowired
    private IProduccionHuevoBusiness produccionHuevoBusiness;

    public List<ProduccionHuevo> ListaHuevos() {
        try {
            return produccionHuevoBusiness.ListaHuevos();
        } catch (Exception e) {
            throw new RuntimeException("Error listando las personal");
        }
    }



}
