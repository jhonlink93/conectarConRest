package com.example.jhonlp.conectarconrest.io;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;

/**
 * Created by jhonlp on 15/12/2017.
 */

/**
 * Esta clase tiene la url base y hace el llamado al servicio usando la clase ApiService que cree como interfaz
 */
public class ApiAdapterRetro {

    private static ApiServiceRetro API_SERVICE;

    public static ApiServiceRetro getApiService() {

        // Creamos un interceptor y le indicamos el log level a usar
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        String baseUrl = "http://otri.sabiofutbol.com/";

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create()) // GsonConverterFactory.create() para tomar un Gson
                    .client(httpClient.build()) // <-- usamos el log level
                    .build();
            API_SERVICE = retrofit.create(ApiServiceRetro.class);
        }

        return API_SERVICE;
    }

}