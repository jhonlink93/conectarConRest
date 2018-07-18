
package com.example.jhonlp.conectarconrest.model;

import java.util.HashMap;
import java.util.Map;

public class Root {

    private RootC root;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public RootC getRoot() {
        return root;
    }

    public void setRoot(RootC root) {
        this.root = root;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
