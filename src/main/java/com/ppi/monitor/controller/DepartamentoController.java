/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.DTO.DepartamentoDTO;
import com.ppi.monitor.business.IDepartamentoBusiness;
import java.util.ArrayList;
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
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class DepartamentoController {

    @Autowired

    private IDepartamentoBusiness departamentoBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/departamento")
    public List<DepartamentoDTO> listaDepartamento() {
        List<DepartamentoDTO> list = new ArrayList<>();
        try {
            list = departamentoBusiness.listaDepartamento();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultando listas.");
        }
        return list;
    }
}
