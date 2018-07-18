
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equipos {

    private List<Equipo> equipo = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Equipo> equipo) {
        this.equipo = equipo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
