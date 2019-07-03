package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.TipoDocumento;
import com.ppi.monitor.model.TipoProducto;

public class TipoProductoDTO {

    private Integer idtipoProducto;
    private String nombreProducto;


    public Integer getIdtipoProducto() {
        return idtipoProducto;
    }

    public void setIdtipoProducto(Integer idtipoProducto) {
        this.idtipoProducto = idtipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    @JsonIgnore
    public TipoProducto getEntity() {
        TipoProducto tipoProducto = new TipoProducto();
        tipoProducto.setIdtipoProducto(idtipoProducto);
        tipoProducto.setNombreProducto(nombreProducto);
        return tipoProducto;
    }
}
