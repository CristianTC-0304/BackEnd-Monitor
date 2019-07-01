package com.ppi.monitor.business;

import com.ppi.monitor.model.ProduccionHuevo;

import java.util.List;

public interface IProduccionHuevoBusiness {

    List<ProduccionHuevo> ListaHuevos();

    void IngresarHuevo(ProduccionHuevo produccionHuevo);
}
