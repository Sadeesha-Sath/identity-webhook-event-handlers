package org.wso2.identity.webhook.caep.event.handler.internal.model;

import org.wso2.identity.webhook.caep.event.handler.internal.model.common.Subject;

import java.util.Map;

public class CAEPSessionRevokedEventPayload extends CAEPBaseEventPayload {

    private CAEPSessionRevokedEventPayload(Builder builder) {
        this.initiatingEntity = builder.initiatingEntity;
        this.eventTimeStamp = builder.eventTimeStamp;
        this.reasonAdmin = builder.reasonAdmin;
        this.reasonUser = builder.reasonUser;
        this.subject = builder.subject;
    }

    public static class Builder {
        private long eventTimeStamp;
        private String initiatingEntity;
        private Map<String,String> reasonAdmin;
        private Map<String,String> reasonUser;
        private Subject subject;

        public Builder eventTimeStamp(long eventTimeStamp) {
            this.eventTimeStamp = eventTimeStamp;
            return this;
        }

        public Builder initiatingEntity(String initiatingEntity) {
            this.initiatingEntity = initiatingEntity;
            return this;
        }

        public Builder reasonAdmin(Map<String,String> reasonAdmin) {
            this.reasonAdmin = reasonAdmin;
            return this;
        }

        public Builder reasonUser(Map<String,String> reasonUser) {
            this.reasonUser = reasonUser;
            return this;
        }

        public Builder subject(Subject subject) {
            this.subject = subject;
            return this;
        }

        public CAEPSessionRevokedEventPayload build() {
            return new CAEPSessionRevokedEventPayload(this);
        }
    }
}
