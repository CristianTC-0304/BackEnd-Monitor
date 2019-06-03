/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IUnidadMedidaDAO;
import com.ppi.monitor.model.UnidadMedida;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class UnidadMedidaDAOImplement implements IUnidadMedidaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UnidadMedida> listaMedidasAlimento() {

        return entityManager.createQuery("SELECT u FROM UnidadMedida u", UnidadMedida.class).getResultList();
    }

}
