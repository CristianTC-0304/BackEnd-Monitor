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
    , @NamedQuery(name = "DtProducto.findByCodigo", query = "SELECT d FROM DtProducto d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "DtProducto.findByDescripcion", query = "SELECT d FROM DtProducto d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "DtProducto.findByTipoMovimiento", query = "SELECT d FROM DtProducto d WHERE d.tipoMovimiento = :tipoMovimiento")
    , @NamedQuery(name = "DtProducto.findByCantidadUnitaria", query = "SELECT d FROM DtProducto d WHERE d.cantidadUnitaria = :cantidadUnitaria")
    , @NamedQuery(name = "DtProducto.findByPromedioUnitario", query = "SELECT d FROM DtProducto d WHERE d.promedioUnitario = :promedioUnitario")
    , @NamedQuery(name = "DtProducto.findByTotalUnitario", query = "SELECT d FROM DtProducto d WHERE d.totalUnitario = :totalUnitario")
    , @NamedQuery(name = "DtProducto.findByCantidadTotal", query = "SELECT d FROM DtProducto d WHERE d.cantidadTotal = :cantidadTotal")
    , @NamedQuery(name = "DtProducto.findByPromedioTotal", query = "SELECT d FROM DtProducto d WHERE d.promedioTotal = :promedioTotal")
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
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "tipo_movimiento")
    private String tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "cantidad_unitaria")
    private int cantidadUnitaria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "promedio_unitario")
    private BigDecimal promedioUnitario;
    @Basic(optional = false)
    @Column(name = "total_unitario")
    private BigDecimal totalUnitario;
    @Basic(optional = false)
    @Column(name = "cantidad_total")
    private int cantidadTotal;
    @Basic(optional = false)
    @Column(name = "promedio_total")
    private BigDecimal promedioTotal;
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

    public DtProducto(Integer iddtProducto, Date fechaMovimiento, String descripcion, String tipoMovimiento, int cantidadUnitaria, BigDecimal promedioUnitario, BigDecimal totalUnitario, int cantidadTotal, BigDecimal promedioTotal, BigDecimal valorTotal) {
        this.iddtProducto = iddtProducto;
        this.fechaMovimiento = fechaMovimiento;
        this.descripcion = descripcion;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidadUnitaria = cantidadUnitaria;
        this.promedioUnitario = promedioUnitario;
        this.totalUnitario = totalUnitario;
        this.cantidadTotal = cantidadTotal;
        this.promedioTotal = promedioTotal;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidadUnitaria() {
        return cantidadUnitaria;
    }

    public void setCantidadUnitaria(int cantidadUnitaria) {
        this.cantidadUnitaria = cantidadUnitaria;
    }

    public BigDecimal getPromedioUnitario() {
        return promedioUnitario;
    }

    public void setPromedioUnitario(BigDecimal promedioUnitario) {
        this.promedioUnitario = promedioUnitario;
    }

    public BigDecimal getTotalUnitario() {
        return totalUnitario;
    }

    public void setTotalUnitario(BigDecimal totalUnitario) {
        this.totalUnitario = totalUnitario;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public BigDecimal getPromedioTotal() {
        return promedioTotal;
    }

    public void setPromedioTotal(BigDecimal promedioTotal) {
        this.promedioTotal = promedioTotal;
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


    public DtProductoDTO getDTO() {
        DtProductoDTO dtProductoDTO = new DtProductoDTO();
        dtProductoDTO.setIddtProducto(getIddtProducto());
        dtProductoDTO.setFechaMovimiento(getFechaMovimiento());
        dtProductoDTO.setCodigo(getCodigo());
        dtProductoDTO.setTipoMovimiento(getTipoMovimiento());
        dtProductoDTO.setDescripcion(getDescripcion());
        dtProductoDTO.setCantidadUnitaria(getCantidadUnitaria());
        dtProductoDTO.setPromedioUnitario(getPromedioUnitario());
        dtProductoDTO.setTotalUnitario(getTotalUnitario());
        dtProductoDTO.setCantidadTotal(getCantidadTotal());
        dtProductoDTO.setPromedioTotal(getPromedioTotal());
        dtProductoDTO.setValorTotal(getValorTotal());
        return dtProductoDTO;
    }

    public void setValorTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
