package com.ppi.monitor.business;

import com.ppi.monitor.model.Producto;

import java.util.List;

public interface IProductoBusiness {

    public List<Producto> listaProducto(int idtipoProducto);

    void crearProducto(Producto producto);

   Producto buscarProducto(String nombreProducto);
}
