package com.cdiag.listarclientes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cdiag.entidades.Cliente;

import java.util.List;

/**
 * Created by caagu01 on 05/09/2016.
 */
public class ClienteAdapter extends BaseAdapter {

    private final Activity actividad;
    public List<Cliente> lista;

    public ClienteAdapter(Activity actividad) {
        this.actividad = actividad;
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
         return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = actividad.getLayoutInflater();

        View vista =inflater.inflate(R.layout.elemento_cliente, null, true);

        TextView txtCedula = (TextView) vista.findViewById(R.id.txtCedula);
        txtCedula.setText(String.valueOf(lista.get(i).getCedCli()));

        TextView txtNombre = (TextView) vista.findViewById(R.id.txtNombre);
        txtNombre.setText(lista.get(i).getNomCli().toString());

        return vista;
    }
}
