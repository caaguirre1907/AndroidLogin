/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdiag.entidades;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author caagu01
 */

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cedCli;

    private String nomCli;

    private int telCli;

    private String emailCli;

    private String dirCli;

    private List<Orden> ordenList;

    public Cliente() {
    }

    public Cliente(Integer cedCli, String nomCli) {
        this.cedCli = cedCli;
        this.nomCli = nomCli;
    }

    public Cliente(Integer cedCli, String nomCli, int telCli, String emailCli) {
        this.cedCli = cedCli;
        this.nomCli = nomCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
    }

    public Integer getCedCli() {
        return cedCli;
    }

    public void setCedCli(Integer cedCli) {
        this.cedCli = cedCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public int getTelCli() {
        return telCli;
    }

    public void setTelCli(int telCli) {
        this.telCli = telCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }


    public List<Orden> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(List<Orden> ordenList) {
        this.ordenList = ordenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedCli != null ? cedCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cedCli == null && other.cedCli != null) || (this.cedCli != null && !this.cedCli.equals(other.cedCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdiag.entidades.Cliente[ cedCli=" + cedCli + " ]";
    }
    
}
