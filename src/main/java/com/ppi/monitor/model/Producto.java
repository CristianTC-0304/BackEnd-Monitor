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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Producto.findByCostoProducto", query = "SELECT p FROM Producto p WHERE p.costoProducto = :costoProducto")
    , @NamedQuery(name = "Producto.findByEntrada", query = "SELECT p FROM Producto p WHERE p.entrada = :entrada")
    , @NamedQuery(name = "Producto.findBySalida", query = "SELECT p FROM Producto p WHERE p.salida = :salida")
    , @NamedQuery(name = "Producto.findByCantidad", query = "SELECT p FROM Producto p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Producto.findByUnidadMedida", query = "SELECT p FROM Producto p WHERE p.unidadMedida = :unidadMedida")
    , @NamedQuery(name = "Producto.findByTipoIngreso", query = "SELECT p FROM Producto p WHERE p.tipoIngreso = :tipoIngreso")
    , @NamedQuery(name = "Producto.findByEstado", query = "SELECT p FROM Producto p WHERE p.estado = :estado")
    , @NamedQuery(name = "Producto.findByMarcaProducto", query = "SELECT p FROM Producto p WHERE p.marcaProducto = :marcaProducto")
    , @NamedQuery(name = "Producto.findByFechaMovimiento", query = "SELECT p FROM Producto p WHERE p.fechaMovimiento = :fechaMovimiento")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto")
    private Integer idproducto;
    @Basic(optional = false)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "costo_producto")
    private BigDecimal costoProducto;
    @Column(name = "entrada")
    private Integer entrada;
    @Column(name = "salida")
    private Integer salida;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "unidad_medida")
    private String unidadMedida;
    @Basic(optional = false)
    @Column(name = "tipo_ingreso")
    private String tipoIngreso;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "marca_producto")
    private String marcaProducto;
    @Basic(optional = false)
    @Column(name = "fecha_movimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaMovimiento;
    @JoinColumn(name = "id_tipo_producto", referencedColumnName = "idtipo_producto")
    @ManyToOne(optional = false)
    private TipoProducto idTipoProducto;

    public Producto() {
    }

    public Producto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Producto(Integer idproducto, String nombreProducto, BigDecimal costoProducto, int cantidad, String unidadMedida, String tipoIngreso, int estado, String marcaProducto, Date fechaMovimiento) {
        this.idproducto = idproducto;
        this.nombreProducto = nombreProducto;
        this.costoProducto = costoProducto;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.tipoIngreso = tipoIngreso;
        this.estado = estado;
        this.marcaProducto = marcaProducto;
        this.fechaMovimiento = fechaMovimiento;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(BigDecimal costoProducto) {
        this.costoProducto = costoProducto;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSalida() {
        return salida;
    }

    public void setSalida(Integer salida) {
        this.salida = salida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(String tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public TipoProducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(TipoProducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.Producto[ idproducto=" + idproducto + " ]";
    }
    
}
