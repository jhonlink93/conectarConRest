
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class Equipo {

    private String alias;
    private String nombre;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
