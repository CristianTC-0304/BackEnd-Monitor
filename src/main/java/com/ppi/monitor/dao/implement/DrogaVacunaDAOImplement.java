/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IDrogaVacunaDAO;
import com.ppi.monitor.model.DrogaVacuna;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class DrogaVacunaDAOImplement implements IDrogaVacunaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DrogaVacuna> listaVacunas() {
        return entityManager.createQuery("SELECT d FROM DrogaVacuna d", DrogaVacuna.class).getResultList();
    }

    @Override
    @Transactional
    public void crearVacuna(DrogaVacuna vacuna) {
        entityManager.persist(vacuna);
    }

    @Override
    @Transactional
    public void actualizarVacuna(DrogaVacuna vacuna) {
        entityManager.merge(vacuna);
    }

    @Override
    public DrogaVacuna buscarVacuna(int idDrogaVacuna) {
        return entityManager.find(DrogaVacuna.class, idDrogaVacuna);
    }

}
