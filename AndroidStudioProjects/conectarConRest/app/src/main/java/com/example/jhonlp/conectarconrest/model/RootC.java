
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class RootC {

    private String numEquipos;
    private String numFechas;
    private PuntosIniciales puntosIniciales;
    private Equipos equipos;
    private Fechas fechas;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(String numEquipos) {
        this.numEquipos = numEquipos;
    }

    public String getNumFechas() {
        return numFechas;
    }

    public void setNumFechas(String numFechas) {
        this.numFechas = numFechas;
    }

    public PuntosIniciales getPuntosIniciales() {
        return puntosIniciales;
    }

    public void setPuntosIniciales(PuntosIniciales puntosIniciales) {
        this.puntosIniciales = puntosIniciales;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public Fechas getFechas() {
        return fechas;
    }

    public void setFechas(Fechas fechas) {
        this.fechas = fechas;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
