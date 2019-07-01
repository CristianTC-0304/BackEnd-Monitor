package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IProductoBusiness;
import com.ppi.monitor.dao.IProductoDAO;
import com.ppi.monitor.model.Producto;
import com.ppi.monitor.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoBusinessImplement implements IProductoBusiness {

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Producto> listaProducto(int idtipoProducto) {
        List<Producto> list = new ArrayList<>();
        try {
            list = productoDAO.listaProducto(idtipoProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado la lista");
        }
        return list;
    }

    @Override
    public void crearProducto(Producto producto) {
        Producto product = producto;
        try {
            if (StringUtil.isNullOrEmpty(producto.getIdproducto())) {
                productoDAO.crearProducto(product);
            } else {
                productoDAO.actualizarProducto(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando producto");
        }
    }


    @Override
    public Producto buscarProducto(String nombreProducto) {
        Producto product = new Producto();
        try {
            product = productoDAO.buscarProducto(nombreProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar producto");
        }
        return product;
    }
}
