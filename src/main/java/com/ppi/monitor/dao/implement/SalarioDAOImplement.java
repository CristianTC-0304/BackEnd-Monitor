/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.ISalarioDAO;
import com.ppi.monitor.model.Salario;
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
public class SalarioDAOImplement implements ISalarioDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Salario> listaSalario() {
        return entityManager.createQuery("SELECT s FROM Salario s", Salario.class).getResultList();
    }

    @Override
    @Transactional
    public void crearSalario(Salario salario) {
        entityManager.persist(salario);
    }

    @Override
    @Transactional
    public void actualizarSalario(Salario salario) {
        entityManager.merge(salario);
    }

    @Override
    public Salario buscarSalario(int idSalario) {
        return entityManager.find(Salario.class, idSalario);
    }

}
