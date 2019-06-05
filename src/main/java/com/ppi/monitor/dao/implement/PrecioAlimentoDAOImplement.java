/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IPrecioAlimentoDAO;
import com.ppi.monitor.model.PrecioAlimento;
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
public class PrecioAlimentoDAOImplement implements IPrecioAlimentoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<PrecioAlimento> listaAlimento() {
        return entityManager.createQuery("SELECT p FROM PrecioAlimento p", PrecioAlimento.class).getResultList();
    }

    @Override
    @Transactional
    public void crearAlimento(PrecioAlimento alimento) {
        entityManager.persist(alimento);
    }

    @Override
    @Transactional
    public void actualizarAlimento(PrecioAlimento alimento) {
        entityManager.merge(alimento);
    }

    @Override
    public PrecioAlimento buscarAlimento(int idPrecioAlimento) {
        return entityManager.find(PrecioAlimento.class, idPrecioAlimento);
    }
}
