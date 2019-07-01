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
@Table(name = "dtll_costo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DtllCosto.findAll", query = "SELECT d FROM DtllCosto d")
    , @NamedQuery(name = "DtllCosto.findByIddtllCosto", query = "SELECT d FROM DtllCosto d WHERE d.iddtllCosto = :iddtllCosto")
    , @NamedQuery(name = "DtllCosto.findByPrecioProducto", query = "SELECT d FROM DtllCosto d WHERE d.precioProducto = :precioProducto")
    , @NamedQuery(name = "DtllCosto.findByFecha", query = "SELECT d FROM DtllCosto d WHERE d.fecha = :fecha")})
public class DtllCosto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddtll_costo")
    private Integer iddtllCosto;
    @Basic(optional = false)
    @Column(name = "precio_producto")
    private String precioProducto;
    @Basic(optional = false)
    @Column(name = "fecha")
    private int fecha;
    @JoinColumn(name = "id_producto", referencedColumnName = "idtipo_producto")
    @ManyToOne(optional = false)
    private TipoProducto idProducto;
    @JoinColumn(name = "idcosto_granja", referencedColumnName = "idcosto_granja")
    @ManyToOne(optional = false)
    private CostoGranja idcostoGranja;

    public DtllCosto() {
    }

    public DtllCosto(Integer iddtllCosto) {
        this.iddtllCosto = iddtllCosto;
    }

    public DtllCosto(Integer iddtllCosto, String precioProducto, int fecha) {
        this.iddtllCosto = iddtllCosto;
        this.precioProducto = precioProducto;
        this.fecha = fecha;
    }

    public Integer getIddtllCosto() {
        return iddtllCosto;
    }

    public void setIddtllCosto(Integer iddtllCosto) {
        this.iddtllCosto = iddtllCosto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public TipoProducto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(TipoProducto idProducto) {
        this.idProducto = idProducto;
    }

    public CostoGranja getIdcostoGranja() {
        return idcostoGranja;
    }

    public void setIdcostoGranja(CostoGranja idcostoGranja) {
        this.idcostoGranja = idcostoGranja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddtllCosto != null ? iddtllCosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtllCosto)) {
            return false;
        }
        DtllCosto other = (DtllCosto) object;
        if ((this.iddtllCosto == null && other.iddtllCosto != null) || (this.iddtllCosto != null && !this.iddtllCosto.equals(other.iddtllCosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.DtllCosto[ iddtllCosto=" + iddtllCosto + " ]";
    }
    
}
