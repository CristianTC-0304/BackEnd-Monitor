/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IDepartamentoDAO;
import com.ppi.monitor.model.Departamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class DepartamentoDAOImplement implements IDepartamentoDAO {

    @PersistenceContext
    private EntityManager entityManager;

   
    @Override
    public List<Departamento> listaDepartamento() {
       return entityManager.createQuery("SELECT d FROM Departamento d", Departamento.class).getResultList();
    }

}
