package com.ppi.monitor.dao;

import com.ppi.monitor.model.CostoAvicola;

import java.util.List;

public interface ICostoAviculaDAO {

    public List<CostoAvicola> listaCostoMensual();

    void ingresarCostoAvicola(CostoAvicola costoAvicola);

    void actualizarCostoAvicola(CostoAvicola costoAvicola);

    CostoAvicola buscarCostoAviculaId(int idCostoAvicola);


}
