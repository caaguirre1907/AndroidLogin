package com.cdiag.listarclientes;

import com.cdiag.entidades.Cliente;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by caagu01 on 05/09/2016.
 */
public class WebService {

    //Namespace of the Webservice - can be found in WSDL
    private static String NAMESPACE = "http://services.cdiag/";
    //Webservice URL - WSDL File location
    private static String URL = "http://10.0.2.2:48176/cdiag/cdiagWS?WSDL";
    //SOAP Action URI again Namespace + Web method name
    private static String SOAP_ACTION = "http://services.cdiag/";

    private static List<HeaderProperty> headerPropertyList = new ArrayList<>();


    public static List<Cliente> listarClientes(String nombreMetodo)
    {
        List<Cliente> listado= new ArrayList<>();

        SoapObject request = new SoapObject(NAMESPACE, nombreMetodo);


        // Create envelope
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        // Set output SOAP object
        envelope.setOutputSoapObject(request);
        // Create HTTP call object
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {
            // Invoke web service
            androidHttpTransport.call(SOAP_ACTION+nombreMetodo, envelope,
                    headerPropertyList);
            // Get the response
            Vector<SoapObject> vector= (Vector<SoapObject>) envelope.getResponse();
            // Assign it to resTxt variable static variable
            System.out.println("vector.toString() = " + vector.toString());
            //listado = response;
            for(SoapObject mas:vector)
            {
                Cliente cliente= new Cliente();
                cliente.setCedCli(Integer.parseInt(mas.getProperty("cedCli").toString()));
                cliente.setNomCli(mas.getProperty("nomCli").toString());
                System.out.println("cliente.toString() = " + cliente.toString());
                listado.add(cliente);


            }


        } catch (Exception e) {
            //Print error
            e.printStackTrace();
            //Assign error message to resTxt
            //resTxt = "Error occured";
        }

        return listado;
    }

}
