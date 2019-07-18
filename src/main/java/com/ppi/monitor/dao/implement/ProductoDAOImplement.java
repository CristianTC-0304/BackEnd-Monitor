package com.ppi.monitor.dao.implement;

import com.ppi.monitor.dao.IProductoDAO;
import com.ppi.monitor.model.Producto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDAOImplement implements IProductoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Producto> listaProducto(int idtipoProducto) {

        return entityManager.createNativeQuery("SELECT * FROM Producto WHERE id_tipo_producto = '" + idtipoProducto + "'", Producto.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void crearProducto(Producto producto) {
        entityManager.persist(producto);
    }


    @Override
    @Transactional
    public void actualizarProducto(Producto producto) {
        entityManager.merge(producto);
    }

    @Override
    public Producto buscarProductoId(int idProducto) {

        return entityManager.find(Producto.class, idProducto);
    }

    @Override
    public Producto buscarProducto(String nombreProducto) {
        Producto producto = new Producto();
        try {
            ArrayList<Producto> setParameter = (ArrayList<Producto>) entityManager.createQuery("SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto", Producto.class)
                    .setParameter("nombreProducto", nombreProducto).getResultList();
            if (!setParameter.isEmpty()) {
                producto = setParameter.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return producto;
    }


}
