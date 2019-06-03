/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IAveDAO;
import com.ppi.monitor.model.Ave;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andreshincapie
 */
@Repository
public class AveDAOImplement implements IAveDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ave> listaAve() {
        return entityManager.createQuery("SELECT a FROM Ave a", Ave.class).getResultList();
    }

    @Override
    @Transactional
    public void crearTipoAve(Ave ave) {
        entityManager.persist(ave);
    }

    @Override
    @Transactional
    public void actualizarTipoAve(Ave ave) {
        entityManager.merge(ave);
    }

}
