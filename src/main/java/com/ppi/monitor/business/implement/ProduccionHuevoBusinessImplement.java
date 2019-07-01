package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.IProduccionHuevoBusiness;
import com.ppi.monitor.dao.IProduccionHuevoDAO;
import com.ppi.monitor.model.ProduccionHuevo;
import com.ppi.monitor.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduccionHuevoBusinessImplement implements IProduccionHuevoBusiness {

    @Autowired
    private IProduccionHuevoDAO produccionHuevoDAO;

    @Override
    public List<ProduccionHuevo> ListaHuevos() {
        List<ProduccionHuevo> list = new ArrayList<>();
        try {
            list = produccionHuevoDAO.ListaHuevos();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultado huevos");
        }
        return list;
    }

    @Override
    public void IngresarHuevo(ProduccionHuevo produccionHuevo) {

        try {
            if (StringUtil.isNullOrEmpty(produccionHuevo.getIdproduccionHuevo())) {
                produccionHuevoDAO.IngresarHuevo(produccionHuevo);
            } else {
                produccionHuevoDAO.actualizarIngresoHuevo(produccionHuevo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando la información huevos");
        }
    }
}
