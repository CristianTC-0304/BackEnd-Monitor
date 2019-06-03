/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IPlantaDAO;
import com.ppi.monitor.model.Planta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class PlantaDAOImplement implements IPlantaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Planta> listaPlanta() {
        return entityManager.createQuery("SELECT p FROM Planta p", Planta.class).getResultList();
    }

}
