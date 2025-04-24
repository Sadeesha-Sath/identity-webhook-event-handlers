package org.wso2.identity.webhook.caep.event.handler.internal.model;

import org.wso2.identity.webhook.caep.event.handler.internal.model.common.Subject;

import java.util.HashMap;
import java.util.Map;

public class CAEPTokenClaimsChangeEventPayload extends CAEPBaseEventPayload{

    private CAEPTokenClaimsChangeEventPayload(Builder builder) {
        this.initiatingEntity = builder.initiatingEntity;
        this.eventTimeStamp = builder.eventTimeStamp;
        this.reasonAdmin = builder.reasonAdmin;
        this.reasonUser = builder.reasonUser;
        this.subject = builder.subject;
        this.claims = builder.claims;
    }

    private Map<String, String> claims;

    public static class Builder {
        private long eventTimeStamp;
        private String initiatingEntity;
        private Map<String,String> reasonAdmin;
        private Map<String,String> reasonUser;
        private Subject subject;
        private Map<String, String> claims = new HashMap<>();

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

        public Builder claims(Map<String, String> claims) {
            this.claims = claims;
            return this;
        }

        public CAEPTokenClaimsChangeEventPayload build() {
            return new CAEPTokenClaimsChangeEventPayload(this);
        }
    }
}
