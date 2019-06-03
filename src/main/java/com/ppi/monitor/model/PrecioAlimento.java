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
@Table(name = "precio_alimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrecioAlimento.findAll", query = "SELECT p FROM PrecioAlimento p")
    , @NamedQuery(name = "PrecioAlimento.findByIdprecioAlimento", query = "SELECT p FROM PrecioAlimento p WHERE p.idprecioAlimento = :idprecioAlimento")
    , @NamedQuery(name = "PrecioAlimento.findByNombre", query = "SELECT p FROM PrecioAlimento p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PrecioAlimento.findByCostoAlimento", query = "SELECT p FROM PrecioAlimento p WHERE p.costoAlimento = :costoAlimento")
    , @NamedQuery(name = "PrecioAlimento.findByEstado", query = "SELECT p FROM PrecioAlimento p WHERE p.estado = :estado")})
public class PrecioAlimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprecio_alimento")
    private Integer idprecioAlimento;
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "costo_alimento")
    private BigDecimal costoAlimento;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @JoinColumn(name = "id_tipo_alimento", referencedColumnName = "idtipo_alimento")
    @ManyToOne(optional = false)
    private TipoAlimento idTipoAlimento;
    @JoinColumn(name = "id_unidad_medida", referencedColumnName = "id_unidad_medida")
    @ManyToOne(optional = false)
    private UnidadMedida idUnidadMedida;

    public PrecioAlimento() {
    }

    public PrecioAlimento(Integer idprecioAlimento) {
        this.idprecioAlimento = idprecioAlimento;
    }

    public PrecioAlimento(Integer idprecioAlimento, BigDecimal costoAlimento, int estado) {
        this.idprecioAlimento = idprecioAlimento;
        this.costoAlimento = costoAlimento;
        this.estado = estado;
    }

    public Integer getIdprecioAlimento() {
        return idprecioAlimento;
    }

    public void setIdprecioAlimento(Integer idprecioAlimento) {
        this.idprecioAlimento = idprecioAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCostoAlimento() {
        return costoAlimento;
    }

    public void setCostoAlimento(BigDecimal costoAlimento) {
        this.costoAlimento = costoAlimento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TipoAlimento getIdTipoAlimento() {
        return idTipoAlimento;
    }

    public void setIdTipoAlimento(TipoAlimento idTipoAlimento) {
        this.idTipoAlimento = idTipoAlimento;
    }

    public UnidadMedida getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(UnidadMedida idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprecioAlimento != null ? idprecioAlimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecioAlimento)) {
            return false;
        }
        PrecioAlimento other = (PrecioAlimento) object;
        if ((this.idprecioAlimento == null && other.idprecioAlimento != null) || (this.idprecioAlimento != null && !this.idprecioAlimento.equals(other.idprecioAlimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.ppi.monitor.model.PrecioAlimento[ idprecioAlimento=" + idprecioAlimento + " ]";
    }
    
}
