/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.Departamento;
import java.util.List;

/**
 *
 * @author 57314
 */
public class DepartamentoDTO {

    private Integer idDepartamento;
    private String departamento;
    private List<MunicipioDTO> municipioList;

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<MunicipioDTO> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<MunicipioDTO> municipioList) {
        this.municipioList = municipioList;
    }

    @JsonIgnore
    public Departamento getEntity() {
        Departamento departamentos = new Departamento();
        departamentos.setIdDepartamento(idDepartamento);
        departamentos.setDepartamento(departamento);
        return departamentos;
    }

}
