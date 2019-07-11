package com.ppi.monitor.business;

import com.ppi.monitor.model.CostoAvicola;

import java.util.List;

public interface ICostoAvicolaBusiness {

    public List<CostoAvicola> listaCostoMensual();

    void ingresarCostoAvicola(CostoAvicola costoAvicola);

}
