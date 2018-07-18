package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fechas {

    private List<Fecha> fecha = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Fecha> getFecha() {
        return fecha;
    }

    public void setFecha(List<Fecha> fecha) {
        this.fecha = fecha;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
