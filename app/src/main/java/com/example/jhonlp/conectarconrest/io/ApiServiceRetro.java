package com.example.jhonlp.conectarconrest.io;


import com.example.jhonlp.conectarconrest.model.TorneoDetalle;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by jhonlp on 15/12/2017.
 * esta clase hace los distintos llamados al servicio teniendo un metodo por cada url distitna asi completa la url dinamicamente
 * y le decimos que metodo debe usar para completar el llamado
 */
public interface ApiServiceRetro {

    @GET ("serviciosRest/torneos")
    Call <ArrayList<TorneoDetalle>> getTorneos();

   @GET
   Call<String> getTabla( @Url String endpointPath);

  /*  @GET(value = "torneo/tablaClasificacion/?torneoDetalleId=26&callback=JSON_CALLBACK")
    Call<RespuestaGenerica> getTabla();
*/



}
