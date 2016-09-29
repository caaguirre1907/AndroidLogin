/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdiag.entidades;

import java.util.Date;

/**
 *
 * @author caagu01
 */
public class ConsultaOrd {
    private String nom_mar;
    private int cantidad;
    private double valor;
    private Date fec_min;
    private Date fec_max;

    public String getNom_mar() {
        return nom_mar;
    }

    public void setNom_mar(String nom_mar) {
        this.nom_mar = nom_mar;
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

    public Date getFec_min() {
        return fec_min;
    }

    public void setFec_min(Date fec_min) {
        this.fec_min = fec_min;
    }

    public Date getFec_max() {
        return fec_max;
    }

    public void setFec_max(Date fec_max) {
        this.fec_max = fec_max;
    }

    public ConsultaOrd(String nom_mar, int cantidad, double valor, Date fec_min, Date fec_max) {
        this.nom_mar = nom_mar;
        this.cantidad = cantidad;
        this.valor = valor;
        this.fec_min = fec_min;
        this.fec_max = fec_max;
    }

    public ConsultaOrd() {
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (nom_mar != null ? nom_mar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsultaOrd)) {
            return false;
        }
        ConsultaOrd other = (ConsultaOrd) object;
        if ((this.nom_mar == null && other.nom_mar != null) || (this.nom_mar != null && !this.nom_mar.equals(other.nom_mar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdiag.entidades.ConsultaOrd[ nom_mar=" + nom_mar + " ]";
    }   
}
