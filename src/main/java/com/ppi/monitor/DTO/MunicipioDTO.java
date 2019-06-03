/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.Municipio;

/**
 *
 * @author 57314
 */
public class MunicipioDTO {

    private Integer idMunicipio;
    private String municipio;

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @JsonIgnore
    public Municipio getEntity() {
        Municipio municipios = new Municipio();
        municipios.setIdMunicipio(idMunicipio);
        municipios.setMunicipio(municipio);
        return municipios;
    }
}
