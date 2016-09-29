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

public class Marca implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer codMar;

    private String nomMar;

    private List<Orden> ordenList;

    public Marca() {
    }

    public Marca(Integer codMar) {
        this.codMar = codMar;
    }

    public Marca(Integer codMar, String nomMar) {
        this.codMar = codMar;
        this.nomMar = nomMar;
    }

    public Integer getCodMar() {
        return codMar;
    }

    public void setCodMar(Integer codMar) {
        this.codMar = codMar;
    }

    public String getNomMar() {
        return nomMar;
    }

    public void setNomMar(String nomMar) {
        this.nomMar = nomMar;
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
        hash += (codMar != null ? codMar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.codMar == null && other.codMar != null) || (this.codMar != null && !this.codMar.equals(other.codMar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdiag.entidades.Marca[ codMar=" + codMar + " ]";
    }
    
}
