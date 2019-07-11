package com.ppi.monitor.business;

import com.ppi.monitor.DTO.ProductoDTO;
import com.ppi.monitor.model.Producto;

import java.util.List;

public interface IProductoBusiness {

    public List<ProductoDTO> listaProducto(int tipoProducto);

    void crearProducto(ProductoDTO productoDTO);

    Producto buscarProducto(String nombreProducto);

    void cambiarEstadoProducto(int idProducto);
}
