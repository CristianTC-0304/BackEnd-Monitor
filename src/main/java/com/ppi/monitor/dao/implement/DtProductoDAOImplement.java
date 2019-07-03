package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IDtProductoDAO;
import com.ppi.monitor.model.DtProducto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DtProductoDAOImplement implements IDtProductoDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<DtProducto> listaDtProducto(int idProducto) {
        return entityManager.createNativeQuery("SELECT * FROM dt_producto WHERE id_producto = '" + idProducto + "'", DtProducto.class).getResultList();
    }

    @Override
    @Transactional
    public void ingresarDtProducto(DtProducto dtProducto) {
        entityManager.persist(dtProducto);
    }

    @Override
    @Transactional
    public void actualizarDtProducto(DtProducto dtProducto) {
        entityManager.merge(dtProducto);
    }

}
