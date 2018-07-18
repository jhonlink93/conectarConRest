
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class Partido {

    private String visitante;
    private String local;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
