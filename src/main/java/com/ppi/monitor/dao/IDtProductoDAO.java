package com.ppi.monitor.dao;

import com.ppi.monitor.model.DtProducto;

import java.util.List;

public interface IDtProductoDAO {

    List<DtProducto> listaDtProducto(int idProducto);

    void ingresarDtProducto(DtProducto dtProducto);

    void actualizarDtProducto(DtProducto dtProducto);

    void eliminarMovimiento(int idDtProducto);
}
