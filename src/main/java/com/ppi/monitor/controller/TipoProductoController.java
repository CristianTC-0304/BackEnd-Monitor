package com.ppi.monitor.controller;

import com.ppi.monitor.business.ITipoProductoBusiness;
import com.ppi.monitor.model.TipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class TipoProductoController {

    @Autowired
    private ITipoProductoBusiness productoBusiness;

    @RequestMapping(method = RequestMethod.GET, value = "/tipoproducto")
    public List<TipoProducto> listaTipoProducto() {
        List<TipoProducto> list = new ArrayList<>();
        try {
           list = productoBusiness.listaTipoProducto();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error listando tipo producto");
        }
     return list;
    }
}
