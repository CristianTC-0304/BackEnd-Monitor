/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.ISalarioBusiness;
import com.ppi.monitor.model.Salario;
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
public class SalarioController {

    @Autowired
    private ISalarioBusiness salarioBusiness;
    
    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/salario")
    public List<Salario> listaSalario() {
        List<Salario> list = new ArrayList<>();
        try {
            list = salarioBusiness.listaSalario();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando los salarios.");
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/salario")
    public String guardarSalario(@RequestBody Salario salario) {
        try {
            salarioBusiness.guardarSalario(salario);
             mensaje = "Información de salario guardado.";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando salarios.");
        }
        return mensaje;
    }
}
