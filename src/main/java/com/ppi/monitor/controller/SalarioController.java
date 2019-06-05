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
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author andreshincapie
 */
@RestController
@RequestMapping (value = "/monitor")
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
             mensaje = "{\"estado\":\"Información de salario guardada.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando salarios.");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/salario/{idSalario}")
    public String cambiarEstadoAlimento(@PathVariable("idSalario") int idSalario) {
        try {
            salarioBusiness.cambiarEstadoSalario(idSalario);
            mensaje = "{\"mensaje\":\"infromación de salario actualizado.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando vacuna");
        }
        return mensaje;
    }
}
