/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.ITipoDocumentoDAO;
import com.ppi.monitor.model.TipoDocumento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class TipoDocumentoDAOImplement implements ITipoDocumentoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TipoDocumento> listaTipoDocumento() {

        return entityManager.createQuery("SELECT t FROM TipoDocumento t", TipoDocumento.class).getResultList();
    }

}
