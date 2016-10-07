package com.cdiag.listarclientes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;


/**
 * Created by caagu01 on 05/10/2016.
 */
public class EliminarCliente extends AppCompatActivity{

    private TextView idEliminarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eliminar_cliente);
        // Set up the login form.
        idEliminarView = (TextView) findViewById(R.id.ideliminar);


       /* mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.button || id == EditorInfo.IME_NULL) {
                    validarInicioSesion();
                    return true;
                }
                return false;
            }
        });
        */

        Button mEmailSignInButton = (Button) findViewById(R.id.btnEliminar);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                eliminarCli();
            }
        });
    }

        private void eliminarCli() {
        // Reset errors.
        idEliminarView.setError("Id Invalido");


        // Store values at the time of the login attempt.
        int idcli = Integer.parseInt(idEliminarView.getText().toString());


        boolean cancel = false;
        View focusView = null;

        // Check for a valid password, if the user entered one.
        if (idcli==0)  {
            idEliminarView.setError("Cliente No encontrado.");
            focusView = idEliminarView;
            cancel = true;
        }
        if (cancel) {
            focusView.requestFocus();

        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            try {
                JSONObject jsonParams = new JSONObject();
                //Integer.parseInt(idEliminarView.getText().toString());
                jsonParams.put("idCliEli", Integer.parseInt(idEliminarView.getText().toString()));
                //jsonParams.put("contrasena", mPasswordView.getText().toString());
                StringEntity entity = new StringEntity(jsonParams.toString());

                invokeWS(entity);
            }catch (JSONException e){
                System.out.println("e = " + e);

            }catch (UnsupportedEncodingException w){

                System.out.println("w = " + w);
            }

        }
    }

    public void invokeWS(StringEntity params){
        // Make RESTful webservice call using AsyncHttpClient object
        AsyncHttpClient client = new AsyncHttpClient();
        //client.addHeader("Accept"," application/json");
        //client.addHeader("content-type"," application/json");
        int cedu = Integer.parseInt(idEliminarView.getText().toString());
        client.delete(getApplicationContext(), "http://10.0.2.2:48176/cdiag/webresources/cdiag.entidades.cliente/" + cedu,
                new AsyncHttpResponseHandler() {


                    // When the response returned by REST has Http response code '200'
                    @Override
                    public void onSuccess(String response) {
                        // Hide Progress Dialogca
                        try {
                            // JSON Object
                            if(response !=null) {
                                JSONObject arreglo = new JSONObject(response);
                               // Cliente cliente = new Cliente();

                                //cliente.setCedCli(arreglo.get("cedCli"));
                                //usuario.setPassword(arreglo.getString("login"));

                                vista_Registro();
                                Toast.makeText(getApplicationContext(), "Usuario Eliminado  " , Toast.LENGTH_LONG).show();
                            }else {

                                Toast.makeText(getApplicationContext(),"Usuario No Eliminado", Toast.LENGTH_LONG).show();
                            }

                        } catch (JSONException e) {
                            // TODO Auto-generated catch block
                            Toast.makeText(getApplicationContext(), "Error Occured [Server's JSON response might be invalid]!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();

                        }

                    }
                    // When the response returned by REST has Http response code other than '200'
                    @Override
                    public void onFailure(int statusCode, Throwable error,
                                          String content) {
                        // Hide Progress Dialog

                        // When Http response code is '404'
                        if(statusCode == 404){
                            Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
                        }
                        // When Http response code is '500'
                        else if(statusCode == 500){
                            Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
                        }
                        // When Http response code other than 404, 500
                        else{
                            System.out.println(content);
                            Toast.makeText(getApplicationContext(), "Codigo " + statusCode + content, Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }


    public void vista_Registro() {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
/*
    public  void  iniciarSesion(View view){
        Intent intent = new Intent();
        intent.setClass(EliminarCliente.this, ListarClientes.class);
        startActivity(intent);

    }
    */


}
