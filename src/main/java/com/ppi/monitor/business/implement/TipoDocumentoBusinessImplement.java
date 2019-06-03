/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.business.ITipoDocumentoBusiness;
import com.ppi.monitor.dao.ITipoDocumentoDAO;
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
public class TipoDocumentoBusinessImplement implements ITipoDocumentoBusiness {

    @Autowired
    private ITipoDocumentoDAO tipoDocumentoDAO;

    @Override
    public List<TipoDocumento> listaTipoDocumento() {
        List<TipoDocumento> list = new ArrayList<>();
        try {
            list = tipoDocumentoDAO.listaTipoDocumento();
        } catch (Exception e) {
        }
        return list;
    }

}
