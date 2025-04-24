package org.wso2.identity.webhook.caep.event.handler.internal.model;

import org.wso2.identity.event.common.publisher.model.EventPayload;
import org.wso2.identity.webhook.caep.event.handler.internal.model.common.Subject;

import java.util.Map;

public abstract class CAEPBaseEventPayload extends EventPayload {
    protected long eventTimeStamp;
    protected String initiatingEntity;
    protected Map<String,String> reasonAdmin;
    protected Map<String,String> reasonUser;
    protected Subject subject;

    public long getEventTimeStamp() {
        return eventTimeStamp;
    }

    public String getInitiatingEntity() {
        return initiatingEntity;
    }

    public Map<String,String> getReasonAdmin() {
        return reasonAdmin;
    }

    public Map<String,String> getReasonUser() {
        return reasonUser;
    }

    public Subject getSubject() {
        return subject;
    }

}
