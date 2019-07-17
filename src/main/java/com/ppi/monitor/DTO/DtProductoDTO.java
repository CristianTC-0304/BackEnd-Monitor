package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.DtProducto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DtProductoDTO {

    private Integer iddtProducto;
    private Date fechaMovimiento;
    private String codigo;
    private String descripcion;
    private String tipoMovimiento;
    private int cantidadUnitaria;
    private BigDecimal promedioUnitario;
    private BigDecimal totalUnitario;
    private BigDecimal promedioTotal;
    private int cantidadTotal;
    private BigDecimal valorTotal;
    private List<DtProductoDTO> dtProductoDTOS;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPromedioTotal() {
        return promedioTotal;
    }

    public void setPromedioTotal(BigDecimal promedioTotal) {
        this.promedioTotal = promedioTotal;
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
    
    public List<DtProductoDTO> getDtProductoDTOS() {
        return dtProductoDTOS;
    }

    public void setDtProductoDTOS(List<DtProductoDTO> dtProductoDTOS) {
        this.dtProductoDTOS = dtProductoDTOS;
    }

    @JsonIgnore
    public DtProducto getEntity() {
        DtProducto dtProducto = new DtProducto();
        dtProducto.setIddtProducto(getIddtProducto());
        dtProducto.setFechaMovimiento(getFechaMovimiento());
        dtProducto.setCodigo(getCodigo());
        dtProducto.setTipoMovimiento(getTipoMovimiento());
        dtProducto.setDescripcion(getDescripcion());
        dtProducto.setCantidadUnitaria(getCantidadUnitaria());
        dtProducto.setPromedioUnitario(getPromedioUnitario());
        dtProducto.setTotalUnitario(getTotalUnitario());
        dtProducto.setCantidadTotal(getCantidadTotal());
        dtProducto.setPromedioTotal(getPromedioTotal());
        dtProducto.setValorTotal(getValorTotal());
        return dtProducto;
    }


}
