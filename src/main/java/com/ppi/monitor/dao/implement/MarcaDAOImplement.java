/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IMarcaDAO;
import com.ppi.monitor.model.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57314
 */
@Repository
public class MarcaDAOImplement implements IMarcaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Marca> listaDeMarcas() {
        return entityManager.createQuery("SELECT m FROM Marca m", Marca.class).getResultList();
    }

}
