/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IPersonalDAO;
import com.ppi.monitor.model.Personal;
import java.util.ArrayList;
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
public class PersonalDAOImplement implements IPersonalDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Personal> listaPersonal() {

        return entityManager.createQuery("SELECT p FROM Personal p", Personal.class).getResultList();
    }

    @Override
    @Transactional
    public void crearPersonal(Personal personal) {
        entityManager.persist(personal);
    }

    @Override
    @Transactional
    public void actualizarPersonal(Personal personal) {
        entityManager.merge(personal);
    }

    @Override
    public Personal buscarPersonal(int idPersonal) {
        return entityManager.find(Personal.class, idPersonal);
    }

    @Override
    public Personal bucarPersonalPorCedula(int documento) {
        Personal personal = new Personal();
        try {
            ArrayList<Personal> setParameter = (ArrayList<Personal>) entityManager.createQuery("SELECT p FROM Personal p WHERE p.documento = :documento", Personal.class)
                    .setParameter("documento", documento).getResultList();
            if (!setParameter.isEmpty()) {
                personal = setParameter.get(0);
            }
        } catch (Exception e) {
        }
        return personal;

    }

}
