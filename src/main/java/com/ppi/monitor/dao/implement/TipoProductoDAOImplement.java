package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.ITipoProductoDAO;
import com.ppi.monitor.model.TipoProducto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TipoProductoDAOImplement implements ITipoProductoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
   public List<TipoProducto> listaTipoProducto(){

        return entityManager.createQuery("SELECT t FROM TipoProducto t", TipoProducto.class).getResultList();

    }


}
