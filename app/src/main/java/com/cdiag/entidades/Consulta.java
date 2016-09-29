/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdiag.entidades;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author caagu01
 */

public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCon;

    private String nomMar;

    private int cantidad;

    private double valor;

    private Date fecMin;

    private Date fecMax;

    public Consulta() {
    }

    public Consulta(Integer idCon) {
        this.idCon = idCon;
    }

    public Consulta(Integer idCon, String nomMar, int cantidad, double valor, Date fecMin, Date fecMax) {
        this.idCon = idCon;
        this.nomMar = nomMar;
        this.cantidad = cantidad;
        this.valor = valor;
        this.fecMin = fecMin;
        this.fecMax = fecMax;
    }

    public Integer getIdCon() {
        return idCon;
    }

    public void setIdCon(Integer idCon) {
        this.idCon = idCon;
    }

    public String getNomMar() {
        return nomMar;
    }

    public void setNomMar(String nomMar) {
        this.nomMar = nomMar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFecMin() {
        return fecMin;
    }

    public void setFecMin(Date fecMin) {
        this.fecMin = fecMin;
    }

    public Date getFecMax() {
        return fecMax;
    }

    public void setFecMax(Date fecMax) {
        this.fecMax = fecMax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCon != null ? idCon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idCon == null && other.idCon != null) || (this.idCon != null && !this.idCon.equals(other.idCon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdiag.entidades.Consulta[ idCon=" + idCon + " ]";
    }
    
}
