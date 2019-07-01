package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ITipoProductoBusiness;
import com.ppi.monitor.dao.ITipoProductoDAO;
import com.ppi.monitor.model.TipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoProductoBusinessImplement implements ITipoProductoBusiness {

    @Autowired
    private ITipoProductoDAO tipoProductoDAO;

    @Override
    public List<TipoProducto> listaTipoProducto() {
        List<TipoProducto> list = new ArrayList<>();
        try {
            list = tipoProductoDAO.listaTipoProducto();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error listando tipo producto");
        }
        return list;
    }
}
