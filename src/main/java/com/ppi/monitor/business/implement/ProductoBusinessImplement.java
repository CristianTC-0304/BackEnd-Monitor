package com.ppi.monitor.business.implement;

import com.ppi.monitor.DTO.DtProductoDTO;
import com.ppi.monitor.DTO.ProductoDTO;
import com.ppi.monitor.business.IProductoBusiness;
import com.ppi.monitor.dao.IDtProductoDAO;
import com.ppi.monitor.dao.IProductoDAO;
import com.ppi.monitor.model.DtProducto;
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
    @Autowired
    private IDtProductoDAO dtProductoDAO;

    @Override
    public List<ProductoDTO> listaProducto(int tipoProducto) {
        List<Producto> listaProducto = productoDAO.listaProducto(tipoProducto);
        try {
            return listaProductoDTO(listaProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado la lista");
        }
    }

    private List<ProductoDTO> listaProductoDTO(List<Producto> listaProducto) {
        List<ProductoDTO> listDTOProducto = new ArrayList<>();
        ProductoDTO productoDTO;
        for (Producto producto : listaProducto) {
            productoDTO = producto.getDTO();
            productoDTO.setListaDtProductoDTO(listaDtProducto(producto.getIdproducto()));
            listDTOProducto.add(productoDTO);
        }
        return listDTOProducto;

    }

    private List<DtProductoDTO> listaDtProducto(Integer idProducto) {
        List<DtProducto> listaDtProducto = dtProductoDAO.listaDtProducto(idProducto);
        List<DtProductoDTO> listaDtProductoDTO = new ArrayList<>();
        DtProductoDTO dtProductoDTO;
        for (DtProducto dtProducto : listaDtProducto) {
            dtProductoDTO = dtProducto.getDTO();
            listaDtProductoDTO.add(dtProductoDTO);
        }
        return listaDtProductoDTO;
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
