package org.wso2.identity.webhook.caep.event.handler.internal.model.common;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Subject {
    private String format;
    private Map<String, Object> properties = new HashMap<>();

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void addProperty(String key, Object value) {
        properties.put(key, value);
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

}
