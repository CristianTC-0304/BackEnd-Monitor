/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.model.Municipio;
import com.ppi.monitor.dao.ImunicipioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andreshincapie
 */
@Repository
public class MunicipioDAOImplement implements ImunicipioDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Municipio> listaMunicipio() {
        return entityManager.createQuery("SELECT m FROM Municipio m", Municipio.class).getResultList();
    }

}
