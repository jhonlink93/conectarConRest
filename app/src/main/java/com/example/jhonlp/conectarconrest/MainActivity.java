package com.example.jhonlp.conectarconrest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jhonlp.conectarconrest.io.CallBGenerico;
import com.example.jhonlp.conectarconrest.io.CallbackTorneoDetalle;
import com.example.jhonlp.conectarconrest.io.ApiAdapterRetro;

import com.example.jhonlp.conectarconrest.model.TorneoDetalle;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       /* retrofit2.Call<ArrayList<TorneoDetalle>> call = ApiAdapterRetro.getApiService().getTorneos();
        CallbackTorneoDetalle callB = new CallbackTorneoDetalle();
        call.enqueue(callB);*/
       String a ="http://otri.sabiofutbol.com/serviciosRest/torneos/";
       String s = "http://otri.sabiofutbol.com/torneo/tablaClasificacion/?torneoDetalleId=26&callback=";
       String b = "http://otri.sabiofutbol.com/consulta/preguntaleSabioMovil/?tiempoMaximo=10&tipoBusqueda=all&solucionesMaximo=3&torneoDetalleId=26&listaSuposiciones=[{\"tipo\":%221%22,%22comparador%22:%22myi%22,%22local%22:%22Leones%22,%22posicion%22:%228%22}]&listaDistribucion=[]&callback=";
       retrofit2.Call<String> call = ApiAdapterRetro.getApiService().getTabla(b);
        CallBGenerico callB = new CallBGenerico();
        call.enqueue(callB);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
