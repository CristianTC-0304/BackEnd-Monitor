/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "droga_vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DrogaVacuna.findAll", query = "SELECT d FROM DrogaVacuna d")
    , @NamedQuery(name = "DrogaVacuna.findByIdDrogaVacuna", query = "SELECT d FROM DrogaVacuna d WHERE d.idDrogaVacuna = :idDrogaVacuna")
    , @NamedQuery(name = "DrogaVacuna.findByNombreVacuna", query = "SELECT d FROM DrogaVacuna d WHERE d.nombreVacuna = :nombreVacuna")
    , @NamedQuery(name = "DrogaVacuna.findByValor", query = "SELECT d FROM DrogaVacuna d WHERE d.valor = :valor")
    , @NamedQuery(name = "DrogaVacuna.findByFechaVencimiento", query = "SELECT d FROM DrogaVacuna d WHERE d.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "DrogaVacuna.findByCantidad", query = "SELECT d FROM DrogaVacuna d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DrogaVacuna.findByEstado", query = "SELECT d FROM DrogaVacuna d WHERE d.estado = :estado")})
public class DrogaVacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_droga_vacuna")
    private Integer idDrogaVacuna;
    @Basic(optional = false)
    @Column(name = "nombre_vacuna")
    private String nombreVacuna;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @JoinColumn(name = "id_presentacion", referencedColumnName = "id_presentacion")
    @ManyToOne(optional = false)
    private Presentacion idPresentacion;

    public DrogaVacuna() {
    }

    public DrogaVacuna(Integer idDrogaVacuna) {
        this.idDrogaVacuna = idDrogaVacuna;
    }

    public DrogaVacuna(Integer idDrogaVacuna, String nombreVacuna, BigDecimal valor, Date fechaVencimiento, int cantidad, int estado) {
        this.idDrogaVacuna = idDrogaVacuna;
        this.nombreVacuna = nombreVacuna;
        this.valor = valor;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Integer getIdDrogaVacuna() {
        return idDrogaVacuna;
    }

    public void setIdDrogaVacuna(Integer idDrogaVacuna) {
        this.idDrogaVacuna = idDrogaVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Presentacion getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Presentacion idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDrogaVacuna != null ? idDrogaVacuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DrogaVacuna)) {
            return false;
        }
        DrogaVacuna other = (DrogaVacuna) object;
        if ((this.idDrogaVacuna == null && other.idDrogaVacuna != null) || (this.idDrogaVacuna != null && !this.idDrogaVacuna.equals(other.idDrogaVacuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.ppi.monitor.model.DrogaVacuna[ idDrogaVacuna=" + idDrogaVacuna + " ]";
    }
    
}
