
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class RespuestaGnerica {

    private Long consultaId;
    private String respuestaXml;
    private String consultaXml;
    private Long resultadoId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Long consultaId) {
        this.consultaId = consultaId;
    }

    public String getRespuestaXml() {
        return respuestaXml;
    }

    public void setRespuestaXml(String respuestaXml) {
        this.respuestaXml = respuestaXml;
    }

    public String getConsultaXml() {
        return consultaXml;
    }

    public void setConsultaXml(String consultaXml) {
        this.consultaXml = consultaXml;
    }

    public Long getResultadoId() {
        return resultadoId;
    }

    public void setResultadoId(Long resultadoId) {
        this.resultadoId = resultadoId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}