package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.ICostoAviculaDAO;
import com.ppi.monitor.model.CostoAvicola;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CostoAvicolaDAOImplement implements ICostoAviculaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CostoAvicola> listaCostoMensual() {
        return entityManager.createQuery("", CostoAvicola.class).getResultList();
    }

    @Override
    @Transactional
    public void ingresarCostoAvicola(CostoAvicola costoAvicola) {
        entityManager.persist(costoAvicola);
    }

    @Override
    @Transactional
    public void actualizarCostoAvicola(CostoAvicola costoAvicola) {
        entityManager.merge(costoAvicola);
    }
}
