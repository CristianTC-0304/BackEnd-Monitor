package com.ppi.monitor.controller;

import com.ppi.monitor.business.IDtProductoBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
public class DtProductoController {

    @Autowired
    private IDtProductoBusiness dtProductoBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.DELETE, value = "/dtProducto/{idDtProducto}")
    public String eliminarMovimiento(@PathVariable("idDtProducto") int idDtProducto) {
        try {
            dtProductoBusiness.eliminarMovimiento(idDtProducto);
            mensaje = "{\"mensaje\":\"Movimiento eliminado correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error eliminando movimiento.");
        }
        return mensaje;
    }
}
