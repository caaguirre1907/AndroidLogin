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

public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer numOrd;

    private Date fecOrd;

    private String desOrd;

    private String estOrd;

    private String serialApa;

    private String nomApa;

    private Usuario login;

    private Marca codMar;

    private Cliente cedCli;

    public Orden() {
    }

    public Orden(Integer numOrd) {
        this.numOrd = numOrd;
    }

    public Orden(Integer numOrd, Date fecOrd, String estOrd, String serialApa, String nomApa) {
        this.numOrd = numOrd;
        this.fecOrd = fecOrd;
        this.estOrd = estOrd;
        this.serialApa = serialApa;
        this.nomApa = nomApa;
    }
    
    public Orden(Date fecOrd){
        this.fecOrd = fecOrd;
    }

    public Integer getNumOrd() {
        return numOrd;
    }

    public void setNumOrd(Integer numOrd) {
        this.numOrd = numOrd;
    }

    public Date getFecOrd() {
        return fecOrd;
    }

    public void setFecOrd(Date fecOrd) {
        this.fecOrd = fecOrd;
    }

    public String getDesOrd() {
        return desOrd;
    }

    public void setDesOrd(String desOrd) {
        this.desOrd = desOrd;
    }

    public String getEstOrd() {
        return estOrd;
    }

    public void setEstOrd(String estOrd) {
        this.estOrd = estOrd;
    }

    public String getSerialApa() {
        return serialApa;
    }

    public void setSerialApa(String serialApa) {
        this.serialApa = serialApa;
    }

    public String getNomApa() {
        return nomApa;
    }

    public void setNomApa(String nomApa) {
        this.nomApa = nomApa;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    public Marca getCodMar() {
        return codMar;
    }

    public void setCodMar(Marca codMar) {
        this.codMar = codMar;
    }

    public Cliente getCedCli() {
        return cedCli;
    }

    public void setCedCli(Cliente cedCli) {
        this.cedCli = cedCli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numOrd != null ? numOrd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.numOrd == null && other.numOrd != null) || (this.numOrd != null && !this.numOrd.equals(other.numOrd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdiag.entidades.Orden[ numOrd=" + numOrd + " ]";
    }
    
}
