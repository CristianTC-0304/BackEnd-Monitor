/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import com.ppi.monitor.DTO.DtProductoDTO;

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
@Table(name = "dt_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DtProducto.findAll", query = "SELECT d FROM DtProducto d")
    , @NamedQuery(name = "DtProducto.findByIddtProducto", query = "SELECT d FROM DtProducto d WHERE d.iddtProducto = :iddtProducto")
    , @NamedQuery(name = "DtProducto.findByFechaMovimiento", query = "SELECT d FROM DtProducto d WHERE d.fechaMovimiento = :fechaMovimiento")
    , @NamedQuery(name = "DtProducto.findByDescripcion", query = "SELECT d FROM DtProducto d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "DtProducto.findByCostoProducto", query = "SELECT d FROM DtProducto d WHERE d.costoProducto = :costoProducto")
    , @NamedQuery(name = "DtProducto.findByEntrada", query = "SELECT d FROM DtProducto d WHERE d.entrada = :entrada")
    , @NamedQuery(name = "DtProducto.findBySalida", query = "SELECT d FROM DtProducto d WHERE d.salida = :salida")
    , @NamedQuery(name = "DtProducto.findByCantidadTotal", query = "SELECT d FROM DtProducto d WHERE d.cantidadTotal = :cantidadTotal")
    , @NamedQuery(name = "DtProducto.findByValorTotal", query = "SELECT d FROM DtProducto d WHERE d.valorTotal = :valorTotal")})
public class DtProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddt_producto")
    private Integer iddtProducto;
    @Basic(optional = false)
    @Column(name = "fecha_movimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaMovimiento;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "costo_producto")
    private BigDecimal costoProducto;
    @Column(name = "entrada")
    private Integer entrada;
    @Column(name = "salida")
    private Integer salida;
    @Basic(optional = false)
    @Column(name = "cantidad_total")
    private int cantidadTotal;
    @Basic(optional = false)
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @JoinColumn(name = "id_producto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public DtProducto() {
    }

    public DtProducto(Integer iddtProducto) {
        this.iddtProducto = iddtProducto;
    }

    public DtProducto(Integer iddtProducto, Date fechaMovimiento, BigDecimal costoProducto, int cantidadTotal, BigDecimal valorTotal) {
        this.iddtProducto = iddtProducto;
        this.fechaMovimiento = fechaMovimiento;
        this.costoProducto = costoProducto;
        this.cantidadTotal = cantidadTotal;
        this.valorTotal = valorTotal;
    }

    public Integer getIddtProducto() {
        return iddtProducto;
    }

    public void setIddtProducto(Integer iddtProducto) {
        this.iddtProducto = iddtProducto;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddtProducto != null ? iddtProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtProducto)) {
            return false;
        }
        DtProducto other = (DtProducto) object;
        if ((this.iddtProducto == null && other.iddtProducto != null) || (this.iddtProducto != null && !this.iddtProducto.equals(other.iddtProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.DtProducto[ iddtProducto=" + iddtProducto + " ]";
    }


    public DtProductoDTO getDTO(){
        DtProductoDTO dtProductoDTO = new DtProductoDTO();
        dtProductoDTO.setIddtProducto(iddtProducto);
        dtProductoDTO.setFechaMovimiento(fechaMovimiento);
        dtProductoDTO.setDescripcion(descripcion);
        dtProductoDTO.setCostoProducto(costoProducto);
        dtProductoDTO.setEntrada(entrada);
        dtProductoDTO.setSalida(salida);
        dtProductoDTO.setCantidadTotal(cantidadTotal);
        dtProductoDTO.setValorTotal(valorTotal);
        return dtProductoDTO;
    }

}
