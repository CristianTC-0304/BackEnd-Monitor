/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.ImunicipioBusiness;
import com.ppi.monitor.model.Municipio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andreshincapie
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class MunicipioController {

    @Autowired
    private ImunicipioBusiness municipioBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/municipio")
    public List<Municipio> listaMunicipio() {
        try {
            return municipioBusiness.listaMunicipio();
        } catch (Exception e) {
        }
        return null;
    }

}
