package com.example.jhonlp.conectarconrest.io;

import android.util.Log;

import com.example.jhonlp.conectarconrest.model.RespuestaGnerica;
import com.example.jhonlp.conectarconrest.model.Root;
import com.example.jhonlp.conectarconrest.model.RootC;
import com.example.jhonlp.conectarconrest.model.Tabla;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import fr.arnaudguyon.xmltojsonlib.XmlToJson;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by jhonlp on 15/12/2017.
 */

public class CallBGenerico implements retrofit2.Callback<String>{


    @Override
    public void onResponse(Call <String> call, Response<String > response) {
        JSONArray equipos=null;
        if(response.isSuccessful()){
            String respuestaGenerica = response.body();
            String ncadena=respuestaGenerica.substring(1,respuestaGenerica.length()-1);
          //  String prueba = "[{\"xmlTabla\": \"<?xml version=\\\"1.0\\\" ?>\\n<!--\\nhttps://resultados.as.com/resultados/futbol/mundial/2018/calendario/grupos_f\\nhttps://resultados.as.com/resultados/futbol/mundial/2018/clasificacion/grupos_f\\n-->\\n<root>\\n<numEquipos>4</numEquipos>\\n<equipos>\\n<equipo><nombre>Alemania</nombre><alias>Alemania</alias></equipo>\\n<equipo><nombre>M\\u00e9xico</nombre><alias>M\\u00e9xico</alias></equipo>\\n<equipo><nombre>Suecia</nombre><alias>Suecia</alias></equipo>\\n<equipo><nombre>Corea del Sur</nombre><alias>Corea del Sur</alias></equipo>\\n</equipos>\\n<numFechas>3</numFechas>\\n<fechas>\\n<fecha><num>1</num><partido><local>Alemania</local><visitante>M\\u00e9xico</visitante></partido><partido><local>Suecia</local><visitante>Corea del Sur</visitante></partido></fecha><fecha><num>2</num><partido><local>Alemania</local><visitante>Suecia</visitante></partido><partido><local>Corea del Sur</local><visitante>M\\u00e9xico</visitante></partido></fecha><fecha><num>3</num><partido><local>Corea del Sur</local><visitante>Alemania</visitante></partido><partido><local>M\\u00e9xico</local><visitante>Suecia</visitante></partido></fecha>\\n</fechas>\\n<puntosIniciales>\\n<puntaje><equipo>Alemania</equipo><puntos>0</puntos></puntaje>\\n<puntaje><equipo>M\\u00e9xico</equipo><puntos>0</puntos></puntaje>\\n<puntaje><equipo>Suecia</equipo><puntos>0</puntos></puntaje>\\n<puntaje><equipo>Corea del Sur</equipo><puntos>0</puntos></puntaje>\\n</puntosIniciales>\\n</root>\\n\"}]";
            JSONArray jsonArr = null;
            JSONObject jsonObject1 =null;




/*
            Gson gson = new Gson();
            TorneoDetalle clicks[] = gson.fromJson(respuestaGenerica, TorneoDetalle[].class);*/
            RespuestaGnerica tabla = null;
        Gson gson= new Gson();
            tabla  = gson.fromJson(respuestaGenerica, RespuestaGnerica.class);

            XmlToJson xmlToJson = new XmlToJson.Builder(tabla.getRespuestaXml()).build();
            JSONObject jsonObject = xmlToJson.toJson();
            try {
                Log.d("respuesta", "hola el json es: " + jsonObject.get("root"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                 equipos = jsonObject.getJSONObject("root").getJSONObject("equipos").getJSONArray("equipo");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Log.d("equipo array ", "hola el json es: " + equipos.toString(3));

                for (int i=0 ; i<equipos.length();i++)
                      {JSONObject jsonObject2= equipos.getJSONObject(i);
                      String s = jsonObject2.getString("alias");
                          Log.d("equipo alias ", "el valor es: " + s);

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            /*List<TorneoDetalle> torneoDetalles = Arrays.asList(clicks);
            Log.d("respuesta", "hola el json es: " + torneoDetalles.get(1).getTorneo().getPais().getNombrePais()  );
*/



            /*TorneoDetalle torneo1 = torneos.get(1);
            id = torneo1.getTorneoDetalleId();
            Torneo tor =torneo1.getTorneo();
            id = tor.getTorneoId();



            Log.d("respuesta","tamaño de la respuesta"+ torneos.size() + "primer id del torneo 1 " + id );*/


           /* Gson gson1 = new Gson();
            Root rootC ;

            rootC = gson1.fromJson(jsonObject.toString(),Root.class);
            Log.d("respuesta","tamaño de la respuesta: " + rootC.getRoot().getEquipos().getEquipo().get(0).getAlias() );// jsonObject.toString()
*/


        }

    }




    @Override
    public void onFailure(Call call, Throwable t) {


        Log.d("respuesta fallida", "hola el json es: ");
    }
}
