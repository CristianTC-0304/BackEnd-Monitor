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
            throw new RuntimeException("Error consultado la lista.");
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
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto product = productoDTO.getEntity();
        ProductoDTO productDTO;
        try {
            if (StringUtil.isNullOrEmpty(productoDTO.getIdproducto())) {
                product.setEstado(1);
                productoDAO.crearProducto(product);
                List<DtProductoDTO> listDtProductoDTO = ingresoDtProducto(productoDTO.getListaDtProductoDTO(), product.getDTO());
                productDTO = product.getDTO();
                productDTO.setListaDtProductoDTO(listDtProductoDTO);
            } else {
                productoDAO.actualizarProducto(product);
                List<DtProductoDTO> listDtProductoDTO = ingresoDtProducto(productoDTO.getListaDtProductoDTO(), product.getDTO());
                productDTO = product.getDTO();
                productDTO.setListaDtProductoDTO(listDtProductoDTO);
            }
            return productDTO;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando producto.");
        }
    }

    private List<DtProductoDTO> ingresoDtProducto(List<DtProductoDTO> list, ProductoDTO productoDTO) {
        List<DtProductoDTO> listDtproductoDto = new ArrayList<>();
        DtProducto dtProducto;
        try {
            if (list.size() > 0) {
                int i = 0;
                for (DtProductoDTO dtProductoDTO : list) {
                    if (StringUtil.isNullOrEmpty(list.get(i).getIddtProducto())) {
                        dtProducto = dtProductoDTO.getEntity();
                        dtProducto.setIdProducto(new Producto(productoDTO.getEntity().getIdproducto()));
                        dtProductoDAO.ingresarDtProducto(dtProducto);
                    } else {
                        dtProducto = dtProductoDTO.getEntity();
                        dtProducto.setIdProducto(new Producto(productoDTO.getEntity().getIdproducto()));
                        dtProductoDAO.actualizarDtProducto(dtProducto);
                    }
                    i++;
                }
            }
            return listDtproductoDto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando Detalle producto.");
        }

    }


    @Override
    public Producto buscarProducto(String nombreProducto) {
        Producto product = new Producto();
        try {
            product = productoDAO.buscarProducto(nombreProducto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar producto.");
        }
        return product;
    }

    @Override
    public void cambiarEstadoProducto(int idProducto) {

        Producto producto = productoDAO.buscarProductoId(idProducto);
        try {
            producto.setEstado(1);
            productoDAO.actualizarProducto(producto);
            // validar si hay cambio de estado en dt producto
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Producto eliminado correctamente");
        }

    }
}
