
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fecha {

    private String num;
    private List<Partido> partido = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<Partido> getPartido() {
        return partido;
    }

    public void setPartido(List<Partido> partido) {
        this.partido = partido;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
