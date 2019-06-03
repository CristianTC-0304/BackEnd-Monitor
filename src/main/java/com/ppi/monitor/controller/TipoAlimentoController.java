/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.controller;

import com.ppi.monitor.business.ITipoAlimentoBusiness;
import com.ppi.monitor.model.TipoAlimento;
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
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class TipoAlimentoController {

    @Autowired
    private ITipoAlimentoBusiness tipoAlimentoBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/tipoAlimento")
    public List<TipoAlimento> listaTipoAlimento() {
        List<TipoAlimento> list = new ArrayList<>();
        try {
            list = tipoAlimentoBusiness.listaTipoAlimento();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando tipo alimento");
        }
        return list;
    }

}
