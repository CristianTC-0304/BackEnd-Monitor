package com.ppi.monitor.controller;

import com.ppi.monitor.business.ICostoAvicolaBusiness;
import com.ppi.monitor.model.CostoAvicola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class CostoAvicolaController {

    @Autowired
    private ICostoAvicolaBusiness costoAvicolaBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/costoavicola")
    public List<CostoAvicola> listaCostoMensual() {
        try {
            return costoAvicolaBusiness.listaCostoMensual();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando costos.");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/costoavicola")
    public String ingresarCostoAvicola(@RequestBody CostoAvicola costoAvicola) {
        try {
            costoAvicolaBusiness.ingresarCostoAvicola(costoAvicola);
            mensaje = "{\"mensaje\":\"Costo guardado correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error ingresando el costo.");
        }
        return mensaje;
    }

}
