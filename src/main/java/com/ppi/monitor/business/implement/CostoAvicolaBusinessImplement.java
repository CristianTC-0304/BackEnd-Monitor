package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ICostoAvicolaBusiness;
import com.ppi.monitor.dao.ICostoAviculaDAO;
import com.ppi.monitor.model.CostoAvicola;
import com.ppi.monitor.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CostoAvicolaBusinessImplement implements ICostoAvicolaBusiness {

    @Autowired
    private ICostoAviculaDAO costoAviculaDAO;

    @Override
    public List<CostoAvicola> listaCostoMensual() {
        List<CostoAvicola> list = new ArrayList<>();
        try {
            list = costoAviculaDAO.listaCostoMensual();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultando lista de costo avicola");
        }
        return list;
    }

    @Override
    public void ingresarCostoAvicola(CostoAvicola costoAvicola) {
        try {
            if (StringUtil.isNullOrEmpty(costoAvicola.getIdcostoAvicola())) {
                costoAviculaDAO.ingresarCostoAvicola(costoAvicola);
            } else {
                costoAviculaDAO.actualizarCostoAvicola(costoAvicola);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error guardando el costo avicola");
        }
    }

    @Override
    public CostoAvicola buscarCostoAvicolaId(int idCostoAvicola) {
        CostoAvicola costoAvicola = costoAviculaDAO.buscarCostoAviculaId(idCostoAvicola);
        try {
            return costoAvicola;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error buscando el costo avicola");
        }
    }


}
