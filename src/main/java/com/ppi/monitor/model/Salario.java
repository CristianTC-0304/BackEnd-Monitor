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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "salario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salario.findAll", query = "SELECT s FROM Salario s")
    , @NamedQuery(name = "Salario.findByIdsalario", query = "SELECT s FROM Salario s WHERE s.idsalario = :idsalario")
    , @NamedQuery(name = "Salario.findBySalario", query = "SELECT s FROM Salario s WHERE s.salario = :salario")
    , @NamedQuery(name = "Salario.findByAuxilioTransporte", query = "SELECT s FROM Salario s WHERE s.auxilioTransporte = :auxilioTransporte")
    , @NamedQuery(name = "Salario.findByPrestacionesSociales", query = "SELECT s FROM Salario s WHERE s.prestacionesSociales = :prestacionesSociales")
    , @NamedQuery(name = "Salario.findByPeriodo", query = "SELECT s FROM Salario s WHERE s.periodo = :periodo")
    , @NamedQuery(name = "Salario.findByEstado", query = "SELECT s FROM Salario s WHERE s.estado = :estado")})
public class Salario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsalario")
    private Integer idsalario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "salario")
    private BigDecimal salario;
    @Basic(optional = false)
    @Column(name = "auxilio_transporte")
    private BigDecimal auxilioTransporte;
    @Basic(optional = false)
    @Column(name = "prestaciones_sociales")
    private BigDecimal prestacionesSociales;
    @Basic(optional = false)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;

    public Salario() {
    }

    public Salario(Integer idsalario) {
        this.idsalario = idsalario;
    }

    public Salario(Integer idsalario, BigDecimal salario, BigDecimal auxilioTransporte, BigDecimal prestacionesSociales, String periodo, int estado) {
        this.idsalario = idsalario;
        this.salario = salario;
        this.auxilioTransporte = auxilioTransporte;
        this.prestacionesSociales = prestacionesSociales;
        this.periodo = periodo;
        this.estado = estado;
    }

    public Integer getIdsalario() {
        return idsalario;
    }

    public void setIdsalario(Integer idsalario) {
        this.idsalario = idsalario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(BigDecimal auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public BigDecimal getPrestacionesSociales() {
        return prestacionesSociales;
    }

    public void setPrestacionesSociales(BigDecimal prestacionesSociales) {
        this.prestacionesSociales = prestacionesSociales;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsalario != null ? idsalario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salario)) {
            return false;
        }
        Salario other = (Salario) object;
        if ((this.idsalario == null && other.idsalario != null) || (this.idsalario != null && !this.idsalario.equals(other.idsalario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.ppi.monitor.model.Salario[ idsalario=" + idsalario + " ]";
    }
    
}
