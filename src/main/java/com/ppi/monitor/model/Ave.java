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
@Table(name = "ave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ave.findAll", query = "SELECT a FROM Ave a")
    , @NamedQuery(name = "Ave.findByIdAve", query = "SELECT a FROM Ave a WHERE a.idAve = :idAve")
    , @NamedQuery(name = "Ave.findByTipoAve", query = "SELECT a FROM Ave a WHERE a.tipoAve = :tipoAve")})
public class Ave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ave")
    private Integer idAve;
    @Basic(optional = false)
    @Column(name = "tipo_ave")
    private String tipoAve;
   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "ave")
    //private Collection<CostoGranja> costoGranjaCollection;

    public Ave() {
    }

    public Ave(Integer idAve) {
        this.idAve = idAve;
    }

    public Ave(Integer idAve, String tipoAve) {
        this.idAve = idAve;
        this.tipoAve = tipoAve;
    }

    public Integer getIdAve() {
        return idAve;
    }

    public void setIdAve(Integer idAve) {
        this.idAve = idAve;
    }

    public String getTipoAve() {
        return tipoAve;
    }

    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }
/*
    @XmlTransient
    public Collection<CostoGranja> getCostoGranjaCollection() {
        return costoGranjaCollection;
    }

    public void setCostoGranjaCollection(Collection<CostoGranja> costoGranjaCollection) {
        this.costoGranjaCollection = costoGranjaCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAve != null ? idAve.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ave)) {
            return false;
        }
        Ave other = (Ave) object;
        if ((this.idAve == null && other.idAve != null) || (this.idAve != null && !this.idAve.equals(other.idAve))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.Ave[ idAve=" + idAve + " ]";
    }
    
}
