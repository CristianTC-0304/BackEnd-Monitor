/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 57314
 */
@Entity
@Table(name = "costo_avicola")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CostoAvicola.findAll", query = "SELECT c FROM CostoAvicola c")
    , @NamedQuery(name = "CostoAvicola.findByIdcostoAvicola", query = "SELECT c FROM CostoAvicola c WHERE c.idcostoAvicola = :idcostoAvicola")
    , @NamedQuery(name = "CostoAvicola.findBySemanaPolla", query = "SELECT c FROM CostoAvicola c WHERE c.semanaPolla = :semanaPolla")
    , @NamedQuery(name = "CostoAvicola.findByFechaCreacion", query = "SELECT c FROM CostoAvicola c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "CostoAvicola.findByPlanta", query = "SELECT c FROM CostoAvicola c WHERE c.planta = :planta")
    , @NamedQuery(name = "CostoAvicola.findByCostoAlimento", query = "SELECT c FROM CostoAvicola c WHERE c.costoAlimento = :costoAlimento")
    , @NamedQuery(name = "CostoAvicola.findByCantidadKg", query = "SELECT c FROM CostoAvicola c WHERE c.cantidadKg = :cantidadKg")
    , @NamedQuery(name = "CostoAvicola.findByTotalAlojamiento", query = "SELECT c FROM CostoAvicola c WHERE c.totalAlojamiento = :totalAlojamiento")
    , @NamedQuery(name = "CostoAvicola.findByTotalManoObra", query = "SELECT c FROM CostoAvicola c WHERE c.totalManoObra = :totalManoObra")
    , @NamedQuery(name = "CostoAvicola.findByAmortizacion", query = "SELECT c FROM CostoAvicola c WHERE c.amortizacion = :amortizacion")
    , @NamedQuery(name = "CostoAvicola.findByTotalVacunas", query = "SELECT c FROM CostoAvicola c WHERE c.totalVacunas = :totalVacunas")
    , @NamedQuery(name = "CostoAvicola.findByDespique", query = "SELECT c FROM CostoAvicola c WHERE c.despique = :despique")
    , @NamedQuery(name = "CostoAvicola.findByCalefacion", query = "SELECT c FROM CostoAvicola c WHERE c.calefacion = :calefacion")
    , @NamedQuery(name = "CostoAvicola.findByViruta", query = "SELECT c FROM CostoAvicola c WHERE c.viruta = :viruta")
    , @NamedQuery(name = "CostoAvicola.findByEmpaque", query = "SELECT c FROM CostoAvicola c WHERE c.empaque = :empaque")
    , @NamedQuery(name = "CostoAvicola.findByMortalidad", query = "SELECT c FROM CostoAvicola c WHERE c.mortalidad = :mortalidad")
    , @NamedQuery(name = "CostoAvicola.findByValorMortalidad", query = "SELECT c FROM CostoAvicola c WHERE c.valorMortalidad = :valorMortalidad")
    , @NamedQuery(name = "CostoAvicola.findBySubTotal", query = "SELECT c FROM CostoAvicola c WHERE c.subTotal = :subTotal")
    , @NamedQuery(name = "CostoAvicola.findByGranTotal", query = "SELECT c FROM CostoAvicola c WHERE c.granTotal = :granTotal")
    , @NamedQuery(name = "CostoAvicola.findByDepresiacion", query = "SELECT c FROM CostoAvicola c WHERE c.depresiacion = :depresiacion")
    , @NamedQuery(name = "CostoAvicola.findByServiciosPublicos", query = "SELECT c FROM CostoAvicola c WHERE c.serviciosPublicos = :serviciosPublicos")})
public class CostoAvicola implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcosto_avicola")
    private Integer idcostoAvicola;
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
    @Basic(optional = false)
    @Column(name = "servicios_publicos")
    private BigDecimal serviciosPublicos;
    @JoinColumn(name = "ave", referencedColumnName = "id_ave")
    @ManyToOne(optional = false)
    private Ave ave;
   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCostoAvicola")
    //private Collection<DtCostoAvicola> dtCostoAvicolaCollection;

    public CostoAvicola() {
    }

    public CostoAvicola(Integer idcostoAvicola) {
        this.idcostoAvicola = idcostoAvicola;
    }

    public CostoAvicola(Integer idcostoAvicola, int semanaPolla, Date fechaCreacion, String planta, BigDecimal costoAlimento, int cantidadKg, BigDecimal totalAlojamiento, BigDecimal totalManoObra, BigDecimal amortizacion, BigDecimal totalVacunas, BigDecimal despique, BigDecimal calefacion, BigDecimal viruta, BigDecimal empaque, String mortalidad, BigDecimal valorMortalidad, BigDecimal subTotal, BigDecimal granTotal, BigDecimal depresiacion, BigDecimal serviciosPublicos) {
        this.idcostoAvicola = idcostoAvicola;
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
        this.serviciosPublicos = serviciosPublicos;
    }

    public Integer getIdcostoAvicola() {
        return idcostoAvicola;
    }

    public void setIdcostoAvicola(Integer idcostoAvicola) {
        this.idcostoAvicola = idcostoAvicola;
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

    public BigDecimal getServiciosPublicos() {
        return serviciosPublicos;
    }

    public void setServiciosPublicos(BigDecimal serviciosPublicos) {
        this.serviciosPublicos = serviciosPublicos;
    }

    public Ave getAve() {
        return ave;
    }

    public void setAve(Ave ave) {
        this.ave = ave;
    }
/*
    @XmlTransient
    public Collection<DtCostoAvicola> getDtCostoAvicolaCollection() {
        return dtCostoAvicolaCollection;
    }

    public void setDtCostoAvicolaCollection(Collection<DtCostoAvicola> dtCostoAvicolaCollection) {
        this.dtCostoAvicolaCollection = dtCostoAvicolaCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcostoAvicola != null ? idcostoAvicola.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostoAvicola)) {
            return false;
        }
        CostoAvicola other = (CostoAvicola) object;
        if ((this.idcostoAvicola == null && other.idcostoAvicola != null) || (this.idcostoAvicola != null && !this.idcostoAvicola.equals(other.idcostoAvicola))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CostoAvicola[ idcostoAvicola=" + idcostoAvicola + " ]";
    }
    
}
