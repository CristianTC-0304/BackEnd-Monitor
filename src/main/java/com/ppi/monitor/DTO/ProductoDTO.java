package com.ppi.monitor.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ppi.monitor.model.Producto;

import java.util.Date;
import java.util.List;

public class ProductoDTO {


    private Integer idproducto;
    private String codProducto;
    private String nombreProducto;
    private MarcaDTO marcaDTO;
    private String unidadMedida;
    private int estado;
    private TipoProductoDTO TipoProductoDTO;
    private List<DtProductoDTO> listaDtProductoDTO;


    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public TipoProductoDTO getTipoProductoDTO() {
        return TipoProductoDTO;
    }

    public void setTipoProductoDTO(TipoProductoDTO tipoProductoDTO) {
        TipoProductoDTO = tipoProductoDTO;
    }

    public List<DtProductoDTO> getListaDtProductoDTO() {
        return listaDtProductoDTO;
    }

    public void setListaDtProductoDTO(List<DtProductoDTO> listaDtProductoDTO) {
        this.listaDtProductoDTO = listaDtProductoDTO;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public MarcaDTO getMarcaDTO() {
        return marcaDTO;
    }

    public void setMarcaDTO(MarcaDTO marcaDTO) {
        this.marcaDTO = marcaDTO;
    }

    @JsonIgnore
    public Producto getEntity() {
        Producto producto = new Producto();
        producto.setIdproducto(idproducto);
        producto.setCodProducto(codProducto);
        producto.setNombreProducto(nombreProducto);
        producto.setMarcaProducto(marcaDTO.getEntity());
        producto.setUnidadMedida(unidadMedida);
        producto.setIdTipoProducto(TipoProductoDTO.getEntity());
        producto.setEstado(estado);
        return producto;
    }


}
