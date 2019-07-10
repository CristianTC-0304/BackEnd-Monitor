package com.ppi.monitor.controller;

import com.ppi.monitor.DTO.ProductoDTO;
import com.ppi.monitor.business.IProductoBusiness;
import com.ppi.monitor.model.Producto;
import com.ppi.monitor.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/monitor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoController {

    @Autowired
    private IProductoBusiness productoBusiness;

    private String mensaje;
    private int idProducto;

    @RequestMapping(method = RequestMethod.GET, value = "/productos/{tipoProducto}")
    public List<ProductoDTO> listaProducto(@PathVariable("tipoProducto") int tipoProducto) {
        try {
            return productoBusiness.listaProducto(tipoProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado la lista");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/producto")
    public String crearProducto(@RequestBody ProductoDTO productoDTO) {

        try {
            productoBusiness.crearProducto(productoDTO);
            mensaje = "{\"mensaje\":\"producto guardado correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando producto");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/producto/{nombreProducto}")
    public Producto buscarProducto(@PathVariable("nombreProducto") String nombreProducto) {

        try {
            return productoBusiness.buscarProducto(nombreProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar producto.");
        }

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/producto/{idProducto}")
    public String eliminarMovimiento(@PathVariable("idProducto") int idProducto) {
        try {
            productoBusiness.cambiarEstadoProducto(idProducto);
            mensaje = "{\"mensaje\":\"producto eliminado correctamente.\"}";
        } catch (Exception e) {

            throw new RuntimeException("Error eliminando producto.");
        }
        return mensaje;
    }

}
