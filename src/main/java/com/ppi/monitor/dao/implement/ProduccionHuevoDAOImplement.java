package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IProduccionHuevoDAO;
import com.ppi.monitor.model.ProduccionHuevo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

@Repository
public class ProduccionHuevoDAOImplement implements IProduccionHuevoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ProduccionHuevo> ListaHuevos() {
        return entityManager.createQuery("SELECT p FROM ProduccionHuevo p", ProduccionHuevo.class).getResultList();
    }

    @Override
    @Transactional
    public void IngresarHuevo(ProduccionHuevo produccionHuevo) {
        entityManager.persist(produccionHuevo);

    }

    @Override
    @Transactional
    public void actualizarIngresoHuevo(ProduccionHuevo produccionHuevo) {

        entityManager.merge(produccionHuevo);
    }
}
