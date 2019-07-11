package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.Marca;

import javax.persistence.*;

public class MarcaDTO {

    private Integer idMarca;
    private String nombreMarca;
    private int estado;


    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @JsonIgnore
    public Marca getEntity() {
        Marca marca = new Marca();
        marca.setIdMarca(getIdMarca());
        marca.setNombreMarca(getNombreMarca());
        marca.setEstado(getEstado());
        return marca;
    }
}
