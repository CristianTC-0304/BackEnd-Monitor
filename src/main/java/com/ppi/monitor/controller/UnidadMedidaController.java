/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.IUnidadMedidaBusiness;
import com.ppi.monitor.model.UnidadMedida;
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
@RequestMapping (value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class UnidadMedidaController {

    @Autowired
    private IUnidadMedidaBusiness unidadMedidaBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/medida")
    public List<UnidadMedida> listaMedidasAlimento() {
        List<UnidadMedida> list = new ArrayList<>();
        try {
            list = unidadMedidaBusiness.listaMedidasAlimento();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando medidas de alimentos");
        }
        return list;
    }
}
