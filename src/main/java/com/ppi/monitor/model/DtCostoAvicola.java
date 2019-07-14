/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "dt_costo_avicola")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DtCostoAvicola.findAll", query = "SELECT d FROM DtCostoAvicola d")
    , @NamedQuery(name = "DtCostoAvicola.findByIddtCostoAvicola", query = "SELECT d FROM DtCostoAvicola d WHERE d.iddtCostoAvicola = :iddtCostoAvicola")
    , @NamedQuery(name = "DtCostoAvicola.findByObservacion", query = "SELECT d FROM DtCostoAvicola d WHERE d.observacion = :observacion")
    , @NamedQuery(name = "DtCostoAvicola.findByCantidad", query = "SELECT d FROM DtCostoAvicola d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DtCostoAvicola.findByValor", query = "SELECT d FROM DtCostoAvicola d WHERE d.valor = :valor")})
public class DtCostoAvicola implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddt_costo_avicola")
    private Integer iddtCostoAvicola;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @JoinColumn(name = "id_costo_avicola", referencedColumnName = "idcosto_avicola")
    @ManyToOne(optional = false)
    private CostoAvicola idCostoAvicola;

    public DtCostoAvicola() {
    }

    public DtCostoAvicola(Integer iddtCostoAvicola) {
        this.iddtCostoAvicola = iddtCostoAvicola;
    }

    public Integer getIddtCostoAvicola() {
        return iddtCostoAvicola;
    }

    public void setIddtCostoAvicola(Integer iddtCostoAvicola) {
        this.iddtCostoAvicola = iddtCostoAvicola;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public CostoAvicola getIdCostoAvicola() {
        return idCostoAvicola;
    }

    public void setIdCostoAvicola(CostoAvicola idCostoAvicola) {
        this.idCostoAvicola = idCostoAvicola;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddtCostoAvicola != null ? iddtCostoAvicola.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtCostoAvicola)) {
            return false;
        }
        DtCostoAvicola other = (DtCostoAvicola) object;
        if ((this.iddtCostoAvicola == null && other.iddtCostoAvicola != null) || (this.iddtCostoAvicola != null && !this.iddtCostoAvicola.equals(other.iddtCostoAvicola))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.DtCostoAvicola[ iddtCostoAvicola=" + iddtCostoAvicola + " ]";
    }
    
}
