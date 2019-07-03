package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.DtProducto;

import java.math.BigDecimal;
import java.util.Date;

public class DtProductoDTO {

    private Integer iddtProducto;
    private Date fechaMovimiento;
    private String descripcion;
    private BigDecimal costoProducto;
    private Integer entrada;
    private Integer salida;
    private int cantidadTotal;
    private BigDecimal valorTotal;


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

    @JsonIgnore
    public DtProducto getEntity() {
        DtProducto dtProducto = new DtProducto();
        dtProducto.setIddtProducto(iddtProducto);
        dtProducto.setFechaMovimiento(fechaMovimiento);
        dtProducto.setDescripcion(descripcion);
        dtProducto.setCostoProducto(costoProducto);
        dtProducto.setEntrada(entrada);
        dtProducto.setSalida(salida);
        dtProducto.setCantidadTotal(cantidadTotal);
        dtProducto.setValorTotal(valorTotal);
        return dtProducto;
    }
}
