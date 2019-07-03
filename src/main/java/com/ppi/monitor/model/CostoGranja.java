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
@Table(name = "costo_granja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CostoGranja.findAll", query = "SELECT c FROM CostoGranja c")
    , @NamedQuery(name = "CostoGranja.findByIdcostoGranja", query = "SELECT c FROM CostoGranja c WHERE c.idcostoGranja = :idcostoGranja")
    , @NamedQuery(name = "CostoGranja.findBySemanaPolla", query = "SELECT c FROM CostoGranja c WHERE c.semanaPolla = :semanaPolla")
    , @NamedQuery(name = "CostoGranja.findByFechaCreacion", query = "SELECT c FROM CostoGranja c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "CostoGranja.findByPlanta", query = "SELECT c FROM CostoGranja c WHERE c.planta = :planta")
    , @NamedQuery(name = "CostoGranja.findByCostoAlimento", query = "SELECT c FROM CostoGranja c WHERE c.costoAlimento = :costoAlimento")
    , @NamedQuery(name = "CostoGranja.findByCantidadKg", query = "SELECT c FROM CostoGranja c WHERE c.cantidadKg = :cantidadKg")
    , @NamedQuery(name = "CostoGranja.findByTotalAlojamiento", query = "SELECT c FROM CostoGranja c WHERE c.totalAlojamiento = :totalAlojamiento")
    , @NamedQuery(name = "CostoGranja.findByTotalManoObra", query = "SELECT c FROM CostoGranja c WHERE c.totalManoObra = :totalManoObra")
    , @NamedQuery(name = "CostoGranja.findByAmortizacion", query = "SELECT c FROM CostoGranja c WHERE c.amortizacion = :amortizacion")
    , @NamedQuery(name = "CostoGranja.findByTotalVacunas", query = "SELECT c FROM CostoGranja c WHERE c.totalVacunas = :totalVacunas")
    , @NamedQuery(name = "CostoGranja.findByDespique", query = "SELECT c FROM CostoGranja c WHERE c.despique = :despique")
    , @NamedQuery(name = "CostoGranja.findByCalefacion", query = "SELECT c FROM CostoGranja c WHERE c.calefacion = :calefacion")
    , @NamedQuery(name = "CostoGranja.findByViruta", query = "SELECT c FROM CostoGranja c WHERE c.viruta = :viruta")
    , @NamedQuery(name = "CostoGranja.findByEmpaque", query = "SELECT c FROM CostoGranja c WHERE c.empaque = :empaque")
    , @NamedQuery(name = "CostoGranja.findByMortalidad", query = "SELECT c FROM CostoGranja c WHERE c.mortalidad = :mortalidad")
    , @NamedQuery(name = "CostoGranja.findByValorMortalidad", query = "SELECT c FROM CostoGranja c WHERE c.valorMortalidad = :valorMortalidad")
    , @NamedQuery(name = "CostoGranja.findBySubTotal", query = "SELECT c FROM CostoGranja c WHERE c.subTotal = :subTotal")
    , @NamedQuery(name = "CostoGranja.findByGranTotal", query = "SELECT c FROM CostoGranja c WHERE c.granTotal = :granTotal")
    , @NamedQuery(name = "CostoGranja.findByDepresiacion", query = "SELECT c FROM CostoGranja c WHERE c.depresiacion = :depresiacion")})
public class CostoGranja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcosto_granja")
    private Integer idcostoGranja;
    @Basic(optional = false)
    @Column(name = "semana_polla")
    private int semanaPolla;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "planta")
    private String planta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "costo_alimento")
    private BigDecimal costoAlimento;
    @Basic(optional = false)
    @Column(name = "cantidad_kg")
    private int cantidadKg;
    @Basic(optional = false)
    @Column(name = "total_alojamiento")
    private BigDecimal totalAlojamiento;
    @Basic(optional = false)
    @Column(name = "total_mano_obra")
    private BigDecimal totalManoObra;
    @Basic(optional = false)
    @Column(name = "amortizacion")
    private BigDecimal amortizacion;
    @Basic(optional = false)
    @Column(name = "total_vacunas")
    private BigDecimal totalVacunas;
    @Basic(optional = false)
    @Column(name = "despique")
    private BigDecimal despique;
    @Basic(optional = false)
    @Column(name = "calefacion")
    private BigDecimal calefacion;
    @Basic(optional = false)
    @Column(name = "viruta")
    private BigDecimal viruta;
    @Basic(optional = false)
    @Column(name = "empaque")
    private BigDecimal empaque;
    @Basic(optional = false)
    @Column(name = "mortalidad")
    private String mortalidad;
    @Basic(optional = false)
    @Column(name = "valor_mortalidad")
    private BigDecimal valorMortalidad;
    @Basic(optional = false)
    @Column(name = "sub_total")
    private BigDecimal subTotal;
    @Basic(optional = false)
    @Column(name = "gran_total")
    private BigDecimal granTotal;
    @Basic(optional = false)
    @Column(name = "depresiacion")
    private BigDecimal depresiacion;
    @JoinColumn(name = "ave", referencedColumnName = "id_ave")
    @ManyToOne(optional = false)
    private Ave ave;

    public CostoGranja() {
    }

    public CostoGranja(Integer idcostoGranja) {
        this.idcostoGranja = idcostoGranja;
    }

    public CostoGranja(Integer idcostoGranja, int semanaPolla, Date fechaCreacion, String planta, BigDecimal costoAlimento, int cantidadKg, BigDecimal totalAlojamiento, BigDecimal totalManoObra, BigDecimal amortizacion, BigDecimal totalVacunas, BigDecimal despique, BigDecimal calefacion, BigDecimal viruta, BigDecimal empaque, String mortalidad, BigDecimal valorMortalidad, BigDecimal subTotal, BigDecimal granTotal, BigDecimal depresiacion) {
        this.idcostoGranja = idcostoGranja;
        this.semanaPolla = semanaPolla;
        this.fechaCreacion = fechaCreacion;
        this.planta = planta;
        this.costoAlimento = costoAlimento;
        this.cantidadKg = cantidadKg;
        this.totalAlojamiento = totalAlojamiento;
        this.totalManoObra = totalManoObra;
        this.amortizacion = amortizacion;
        this.totalVacunas = totalVacunas;
        this.despique = despique;
        this.calefacion = calefacion;
        this.viruta = viruta;
        this.empaque = empaque;
        this.mortalidad = mortalidad;
        this.valorMortalidad = valorMortalidad;
        this.subTotal = subTotal;
        this.granTotal = granTotal;
        this.depresiacion = depresiacion;
    }

    public Integer getIdcostoGranja() {
        return idcostoGranja;
    }

    public void setIdcostoGranja(Integer idcostoGranja) {
        this.idcostoGranja = idcostoGranja;
    }

    public int getSemanaPolla() {
        return semanaPolla;
    }

    public void setSemanaPolla(int semanaPolla) {
        this.semanaPolla = semanaPolla;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public BigDecimal getCostoAlimento() {
        return costoAlimento;
    }

    public void setCostoAlimento(BigDecimal costoAlimento) {
        this.costoAlimento = costoAlimento;
    }

    public int getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(int cantidadKg) {
        this.cantidadKg = cantidadKg;
    }

    public BigDecimal getTotalAlojamiento() {
        return totalAlojamiento;
    }

    public void setTotalAlojamiento(BigDecimal totalAlojamiento) {
        this.totalAlojamiento = totalAlojamiento;
    }

    public BigDecimal getTotalManoObra() {
        return totalManoObra;
    }

    public void setTotalManoObra(BigDecimal totalManoObra) {
        this.totalManoObra = totalManoObra;
    }

    public BigDecimal getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(BigDecimal amortizacion) {
        this.amortizacion = amortizacion;
    }

    public BigDecimal getTotalVacunas() {
        return totalVacunas;
    }

    public void setTotalVacunas(BigDecimal totalVacunas) {
        this.totalVacunas = totalVacunas;
    }

    public BigDecimal getDespique() {
        return despique;
    }

    public void setDespique(BigDecimal despique) {
        this.despique = despique;
    }

    public BigDecimal getCalefacion() {
        return calefacion;
    }

    public void setCalefacion(BigDecimal calefacion) {
        this.calefacion = calefacion;
    }

    public BigDecimal getViruta() {
        return viruta;
    }

    public void setViruta(BigDecimal viruta) {
        this.viruta = viruta;
    }

    public BigDecimal getEmpaque() {
        return empaque;
    }

    public void setEmpaque(BigDecimal empaque) {
        this.empaque = empaque;
    }

    public String getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(String mortalidad) {
        this.mortalidad = mortalidad;
    }

    public BigDecimal getValorMortalidad() {
        return valorMortalidad;
    }

    public void setValorMortalidad(BigDecimal valorMortalidad) {
        this.valorMortalidad = valorMortalidad;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getGranTotal() {
        return granTotal;
    }

    public void setGranTotal(BigDecimal granTotal) {
        this.granTotal = granTotal;
    }

    public BigDecimal getDepresiacion() {
        return depresiacion;
    }

    public void setDepresiacion(BigDecimal depresiacion) {
        this.depresiacion = depresiacion;
    }

    public Ave getAve() {
        return ave;
    }

    public void setAve(Ave ave) {
        this.ave = ave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcostoGranja != null ? idcostoGranja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostoGranja)) {
            return false;
        }
        CostoGranja other = (CostoGranja) object;
        if ((this.idcostoGranja == null && other.idcostoGranja != null) || (this.idcostoGranja != null && !this.idcostoGranja.equals(other.idcostoGranja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CostoGranja[ idcostoGranja=" + idcostoGranja + " ]";
    }
    
}
