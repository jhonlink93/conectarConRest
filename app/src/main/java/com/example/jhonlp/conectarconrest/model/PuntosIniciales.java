
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PuntosIniciales {

    private List<Puntaje> puntaje = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Puntaje> getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(List<Puntaje> puntaje) {
        this.puntaje = puntaje;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
