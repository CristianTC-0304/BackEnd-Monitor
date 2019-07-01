/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "tipo_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoProducto.findAll", query = "SELECT t FROM TipoProducto t")
    , @NamedQuery(name = "TipoProducto.findByIdtipoProducto", query = "SELECT t FROM TipoProducto t WHERE t.idtipoProducto = :idtipoProducto")
    , @NamedQuery(name = "TipoProducto.findByNombreProducto", query = "SELECT t FROM TipoProducto t WHERE t.nombreProducto = :nombreProducto")})
public class TipoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_producto")
    private Integer idtipoProducto;
    @Basic(optional = false)
    @Column(name = "nombre_producto")
    private String nombreProducto;

    public TipoProducto() {
    }

    public TipoProducto(Integer idtipoProducto) {
        this.idtipoProducto = idtipoProducto;
    }

    public TipoProducto(Integer idtipoProducto, String nombreProducto) {
        this.idtipoProducto = idtipoProducto;
        this.nombreProducto = nombreProducto;
    }

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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoProducto != null ? idtipoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProducto)) {
            return false;
        }
        TipoProducto other = (TipoProducto) object;
        if ((this.idtipoProducto == null && other.idtipoProducto != null) || (this.idtipoProducto != null && !this.idtipoProducto.equals(other.idtipoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TipoProducto[ idtipoProducto=" + idtipoProducto + " ]";
    }
    
}
