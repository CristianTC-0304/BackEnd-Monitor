package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IDtProductoBusiness;
import com.ppi.monitor.dao.IDtProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DtProductoBusinessImplement implements IDtProductoBusiness {

    @Autowired
    private IDtProductoDAO dtProductoDAO;

    @Override
    public void eliminarMovimiento(int idDtProducto) {

        try {
            dtProductoDAO.eliminarMovimiento(idDtProducto);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error eliminando movimiento.");
        }
    }
}
