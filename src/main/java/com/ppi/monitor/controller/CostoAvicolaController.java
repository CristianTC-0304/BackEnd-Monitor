package com.ppi.monitor.controller;

import com.ppi.monitor.business.ICostoAvicolaBusiness;
import com.ppi.monitor.model.CostoAvicola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class CostoAvicolaController {

    @Autowired
    private ICostoAvicolaBusiness costoAvicolaBusiness;

    public List<CostoAvicola>listaCostoMensual(){
        return null;
    }



}
