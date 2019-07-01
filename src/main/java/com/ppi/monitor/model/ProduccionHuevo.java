/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppi.monitor.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "produccion_huevo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduccionHuevo.findAll", query = "SELECT p FROM ProduccionHuevo p")
    , @NamedQuery(name = "ProduccionHuevo.findByIdproduccionHuevo", query = "SELECT p FROM ProduccionHuevo p WHERE p.idproduccionHuevo = :idproduccionHuevo")
    , @NamedQuery(name = "ProduccionHuevo.findByGranja", query = "SELECT p FROM ProduccionHuevo p WHERE p.granja = :granja")
    , @NamedQuery(name = "ProduccionHuevo.findByLote", query = "SELECT p FROM ProduccionHuevo p WHERE p.lote = :lote")
    , @NamedQuery(name = "ProduccionHuevo.findByLinea", query = "SELECT p FROM ProduccionHuevo p WHERE p.linea = :linea")
    , @NamedQuery(name = "ProduccionHuevo.findBySemana", query = "SELECT p FROM ProduccionHuevo p WHERE p.semana = :semana")
    , @NamedQuery(name = "ProduccionHuevo.findByDia", query = "SELECT p FROM ProduccionHuevo p WHERE p.dia = :dia")
    , @NamedQuery(name = "ProduccionHuevo.findByYumbo", query = "SELECT p FROM ProduccionHuevo p WHERE p.yumbo = :yumbo")
    , @NamedQuery(name = "ProduccionHuevo.findByExtra", query = "SELECT p FROM ProduccionHuevo p WHERE p.extra = :extra")
    , @NamedQuery(name = "ProduccionHuevo.findByAa", query = "SELECT p FROM ProduccionHuevo p WHERE p.aa = :aa")
    , @NamedQuery(name = "ProduccionHuevo.findByA", query = "SELECT p FROM ProduccionHuevo p WHERE p.a = :a")
    , @NamedQuery(name = "ProduccionHuevo.findByB", query = "SELECT p FROM ProduccionHuevo p WHERE p.b = :b")
    , @NamedQuery(name = "ProduccionHuevo.findByC", query = "SELECT p FROM ProduccionHuevo p WHERE p.c = :c")
    , @NamedQuery(name = "ProduccionHuevo.findByPipo", query = "SELECT p FROM ProduccionHuevo p WHERE p.pipo = :pipo")
    , @NamedQuery(name = "ProduccionHuevo.findBySucio", query = "SELECT p FROM ProduccionHuevo p WHERE p.sucio = :sucio")
    , @NamedQuery(name = "ProduccionHuevo.findByTotiado", query = "SELECT p FROM ProduccionHuevo p WHERE p.totiado = :totiado")
    , @NamedQuery(name = "ProduccionHuevo.findByYema", query = "SELECT p FROM ProduccionHuevo p WHERE p.yema = :yema")
    , @NamedQuery(name = "ProduccionHuevo.findBySegundas", query = "SELECT p FROM ProduccionHuevo p WHERE p.segundas = :segundas")
    , @NamedQuery(name = "ProduccionHuevo.findByTotal", query = "SELECT p FROM ProduccionHuevo p WHERE p.total = :total")
    , @NamedQuery(name = "ProduccionHuevo.findByFecha", query = "SELECT p FROM ProduccionHuevo p WHERE p.fecha = :fecha")})
public class ProduccionHuevo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduccion_huevo")
    private Integer idproduccionHuevo;
    @Basic(optional = false)
    @Column(name = "granja")
    private String granja;
    @Basic(optional = false)
    @Column(name = "lote")
    private int lote;
    @Basic(optional = false)
    @Column(name = "linea")
    private String linea;
    @Basic(optional = false)
    @Column(name = "semana")
    private int semana;
    @Basic(optional = false)
    @Column(name = "dia")
    private int dia;
    @Basic(optional = false)
    @Column(name = "yumbo")
    private int yumbo;
    @Basic(optional = false)
    @Column(name = "extra")
    private int extra;
    @Basic(optional = false)
    @Column(name = "aa")
    private int aa;
    @Basic(optional = false)
    @Column(name = "a")
    private int a;
    @Basic(optional = false)
    @Column(name = "b")
    private int b;
    @Basic(optional = false)
    @Column(name = "c")
    private int c;
    @Basic(optional = false)
    @Column(name = "pipo")
    private int pipo;
    @Basic(optional = false)
    @Column(name = "sucio")
    private int sucio;
    @Basic(optional = false)
    @Column(name = "totiado")
    private int totiado;
    @Basic(optional = false)
    @Column(name = "yema")
    private int yema;
    @Basic(optional = false)
    @Column(name = "Segundas")
    private int segundas;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public ProduccionHuevo() {
    }

    public ProduccionHuevo(Integer idproduccionHuevo) {
        this.idproduccionHuevo = idproduccionHuevo;
    }

    public ProduccionHuevo(Integer idproduccionHuevo, String granja, int lote, String linea, int semana, int dia, int yumbo, int extra, int aa, int a, int b, int c, int pipo, int sucio, int totiado, int yema, int segundas, int total, Date fecha) {
        this.idproduccionHuevo = idproduccionHuevo;
        this.granja = granja;
        this.lote = lote;
        this.linea = linea;
        this.semana = semana;
        this.dia = dia;
        this.yumbo = yumbo;
        this.extra = extra;
        this.aa = aa;
        this.a = a;
        this.b = b;
        this.c = c;
        this.pipo = pipo;
        this.sucio = sucio;
        this.totiado = totiado;
        this.yema = yema;
        this.segundas = segundas;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getIdproduccionHuevo() {
        return idproduccionHuevo;
    }

    public void setIdproduccionHuevo(Integer idproduccionHuevo) {
        this.idproduccionHuevo = idproduccionHuevo;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getYumbo() {
        return yumbo;
    }

    public void setYumbo(int yumbo) {
        this.yumbo = yumbo;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getPipo() {
        return pipo;
    }

    public void setPipo(int pipo) {
        this.pipo = pipo;
    }

    public int getSucio() {
        return sucio;
    }

    public void setSucio(int sucio) {
        this.sucio = sucio;
    }

    public int getTotiado() {
        return totiado;
    }

    public void setTotiado(int totiado) {
        this.totiado = totiado;
    }

    public int getYema() {
        return yema;
    }

    public void setYema(int yema) {
        this.yema = yema;
    }

    public int getSegundas() {
        return segundas;
    }

    public void setSegundas(int segundas) {
        this.segundas = segundas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduccionHuevo != null ? idproduccionHuevo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduccionHuevo)) {
            return false;
        }
        ProduccionHuevo other = (ProduccionHuevo) object;
        if ((this.idproduccionHuevo == null && other.idproduccionHuevo != null) || (this.idproduccionHuevo != null && !this.idproduccionHuevo.equals(other.idproduccionHuevo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ProduccionHuevo[ idproduccionHuevo=" + idproduccionHuevo + " ]";
    }
    
}
