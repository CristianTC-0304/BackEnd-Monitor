/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "planta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planta.findAll", query = "SELECT p FROM Planta p")
    , @NamedQuery(name = "Planta.findByIdplanta", query = "SELECT p FROM Planta p WHERE p.idplanta = :idplanta")
    , @NamedQuery(name = "Planta.findByNombrePlanta", query = "SELECT p FROM Planta p WHERE p.nombrePlanta = :nombrePlanta")})
public class Planta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplanta")
    private Integer idplanta;
    @Basic(optional = false)
    @Column(name = "nombre_planta")
    private String nombrePlanta;

    public Planta() {
    }

    public Planta(Integer idplanta) {
        this.idplanta = idplanta;
    }

    public Planta(Integer idplanta, String nombrePlanta) {
        this.idplanta = idplanta;
        this.nombrePlanta = nombrePlanta;
    }

    public Integer getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Integer idplanta) {
        this.idplanta = idplanta;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplanta != null ? idplanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planta)) {
            return false;
        }
        Planta other = (Planta) object;
        if ((this.idplanta == null && other.idplanta != null) || (this.idplanta != null && !this.idplanta.equals(other.idplanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.ppi.monitor.model.Planta[ idplanta=" + idplanta + " ]";
    }
    
}
