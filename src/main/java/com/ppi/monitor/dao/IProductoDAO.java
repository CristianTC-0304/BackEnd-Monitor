package com.ppi.monitor.dao;

import com.ppi.monitor.model.Producto;

import java.util.List;

public interface IProductoDAO {

    public List<Producto> listaProducto(int idtipoProducto);

    void crearProducto(Producto producto);

    void actualizarProducto(Producto producto);

    Producto buscarProducto(String nombreProducto);

    Producto buscarProductoId(int idProducto);
}
