/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.ICargoBusiness;
import com.ppi.monitor.model.Cargo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 57314
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class CargoController {

    @Autowired
    private ICargoBusiness cargoBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/cargo")
    public List<Cargo> listaCargo() {
        try {
            return cargoBusiness.listaCargo();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
