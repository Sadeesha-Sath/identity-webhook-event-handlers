package org.wso2.identity.webhook.caep.event.handler.internal.model.common;

import java.util.HashMap;
import java.util.Map;

public class ComplexSubject extends Subject {

    public ComplexSubject() {
        setFormat("complex");
    }

    public ComplexSubject(Map<String, SimpleSubject> subjectMap) {
        setFormat("complex");
        Map<String, Object> tempMap = new HashMap<>(subjectMap); // Look into this
        setProperties(tempMap);
    }
}
