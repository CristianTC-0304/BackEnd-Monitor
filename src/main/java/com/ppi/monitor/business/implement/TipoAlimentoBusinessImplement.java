/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ITipoAlimentoBusiness;
import com.ppi.monitor.business.ITipoDocumentoBusiness;
import com.ppi.monitor.dao.ITipoAlimentoDAO;
import com.ppi.monitor.model.TipoAlimento;
import com.ppi.monitor.model.TipoDocumento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class TipoAlimentoBusinessImplement implements ITipoAlimentoBusiness {

    @Autowired
    private ITipoAlimentoDAO tipoAlimentoDAO;

    @Override
    public List<TipoAlimento> listaTipoAlimento() {

        List<TipoAlimento> list = new ArrayList<>();
        try {
            list = tipoAlimentoDAO.listaTipoAlimento();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando tipo alimento");
        }
        return list;
    }

}
