/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.business.implement;

import com.ppi.monitor.DTO.DepartamentoDTO;
import com.ppi.monitor.DTO.MunicipioDTO;
import com.ppi.monitor.business.IDepartamentoBusiness;
import com.ppi.monitor.dao.IDepartamentoDAO;
import com.ppi.monitor.dao.ImunicipioDAO;
import com.ppi.monitor.model.Departamento;
import com.ppi.monitor.model.Municipio;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57314
 */
@Service
public class DepartamentoBusinessImplement implements IDepartamentoBusiness {

    @Autowired
    private IDepartamentoDAO departamentoDAO;

    @Autowired
    private ImunicipioDAO municipioDAO;

    @Override
    public List<DepartamentoDTO> listaDepartamento() {
        List<Departamento> listaDepartamento = departamentoDAO.listaDepartamento();
        try {
            return listaDepartamentoDTO(listaDepartamento);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error listando los departamentos.");
        }
    }

    private List<DepartamentoDTO> listaDepartamentoDTO(List<Departamento> listaDepartamento) {
        List<DepartamentoDTO> listaDepartamentoDto = new ArrayList<>();
        DepartamentoDTO departamentodto;
        for (Departamento departamento : listaDepartamento) {
            departamentodto = departamento.getDTO();
            departamentodto.setMunicipioList(listaMunicipios(departamento.getIdDepartamento()));
            listaDepartamentoDto.add(departamentodto);
        }
        return listaDepartamentoDto;
    }

    private List<MunicipioDTO> listaMunicipios(Integer idDepartamento) {
        List<Municipio> listaMunicipios = municipioDAO.listaMunicipio();
        List<MunicipioDTO> listaDto = new ArrayList<>();
        MunicipioDTO municipioDTO;
        for (Municipio municipio : listaMunicipios) {
            if (Objects.equals(municipio.getDepartamentoId().getIdDepartamento(), idDepartamento)) {
                municipioDTO = municipio.getDTO();
                listaDto.add(municipioDTO);
            }
        }
        return listaDto;
    }

}
