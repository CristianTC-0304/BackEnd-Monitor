package com.ppi.monitor.dao;

import com.ppi.monitor.model.ProduccionHuevo;

import java.util.List;

public interface IProduccionHuevoDAO {

    List<ProduccionHuevo> ListaHuevos();

    void IngresarHuevo(ProduccionHuevo produccionHuevo);

    void actualizarIngresoHuevo(ProduccionHuevo produccionHuevo);

}
