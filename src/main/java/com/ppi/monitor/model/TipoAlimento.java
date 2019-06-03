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
@Table(name = "tipo_alimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAlimento.findAll", query = "SELECT t FROM TipoAlimento t")
    , @NamedQuery(name = "TipoAlimento.findByIdtipoAlimento", query = "SELECT t FROM TipoAlimento t WHERE t.idtipoAlimento = :idtipoAlimento")
    , @NamedQuery(name = "TipoAlimento.findByNombreTipoAlimento", query = "SELECT t FROM TipoAlimento t WHERE t.nombreTipoAlimento = :nombreTipoAlimento")})
public class TipoAlimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_alimento")
    private Integer idtipoAlimento;
    @Basic(optional = false)
    @Column(name = "nombre_tipo_alimento")
    private String nombreTipoAlimento;
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
    @ManyToOne(optional = false)
    private Marca idMarca;

    public TipoAlimento() {
    }

    public TipoAlimento(Integer idtipoAlimento) {
        this.idtipoAlimento = idtipoAlimento;
    }

    public TipoAlimento(Integer idtipoAlimento, String nombreTipoAlimento) {
        this.idtipoAlimento = idtipoAlimento;
        this.nombreTipoAlimento = nombreTipoAlimento;
    }

    public Integer getIdtipoAlimento() {
        return idtipoAlimento;
    }

    public void setIdtipoAlimento(Integer idtipoAlimento) {
        this.idtipoAlimento = idtipoAlimento;
    }

    public String getNombreTipoAlimento() {
        return nombreTipoAlimento;
    }

    public void setNombreTipoAlimento(String nombreTipoAlimento) {
        this.nombreTipoAlimento = nombreTipoAlimento;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoAlimento != null ? idtipoAlimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAlimento)) {
            return false;
        }
        TipoAlimento other = (TipoAlimento) object;
        if ((this.idtipoAlimento == null && other.idtipoAlimento != null) || (this.idtipoAlimento != null && !this.idtipoAlimento.equals(other.idtipoAlimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.ppi.monitor.model.TipoAlimento[ idtipoAlimento=" + idtipoAlimento + " ]";
    }

}
