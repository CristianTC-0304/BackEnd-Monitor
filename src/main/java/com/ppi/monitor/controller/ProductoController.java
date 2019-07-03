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
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class ProductoController {

    @Autowired
    private IProductoBusiness productoBusiness;

    private String mensaje;

    @RequestMapping(method = RequestMethod.GET, value = "/producto/{tipoProducto}")
    public List<ProductoDTO> listaProducto(@PathVariable("tipoProducto") int tipoProducto) {
        try {
            return productoBusiness.listaProducto(tipoProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado la lista");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/producto")
    public String crearProducto(@RequestBody Producto producto) {

        try {
            productoBusiness.crearProducto(producto);
            mensaje = "{\"mensaje\":\"producto guardado correctamente.\"}";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando producto");
        }
        return mensaje;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/producto/nombreProducto")
    public Producto buscarProducto(@PathVariable("nombreProducto") String nombreProducto) {
        Producto product = new Producto();
        try {
            product = productoBusiness.buscarProducto(nombreProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar producto");
        }
        return product;
    }

}
