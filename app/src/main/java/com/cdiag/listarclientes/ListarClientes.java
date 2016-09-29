package com.cdiag.listarclientes;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;

import com.cdiag.entidades.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caagu01 on 05/09/2016.
 */
public class ListarClientes extends ListActivity{

    private ClienteAdapter clienteAdapter;
    private List<Cliente> listado = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listar_clientes);

        AsyncCallWS asyn = new AsyncCallWS();
        asyn.execute();

        clienteAdapter = new ClienteAdapter(this);

    }

    private class AsyncCallWS extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... params) {

            listado= WebService.listarClientes("ListarClientes");

            return null;
        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            clienteAdapter.setLista(listado);
            setListAdapter(clienteAdapter);

            //super.onPostExecute(aVoid);
        }
    }
}
