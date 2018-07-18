
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class Tabla {

    private String xmlTabla;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getXmlTabla() {
        return xmlTabla;
    }

    public void setXmlTabla(String xmlTabla) {
        this.xmlTabla = xmlTabla;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}