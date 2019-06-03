/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.ICargoDAO;
import com.ppi.monitor.model.Cargo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class cargoDAOImplement implements ICargoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cargo> listaCargo() {
        return entityManager.createQuery("SELECT c FROM Cargo c", Cargo.class).getResultList();
    }

}
