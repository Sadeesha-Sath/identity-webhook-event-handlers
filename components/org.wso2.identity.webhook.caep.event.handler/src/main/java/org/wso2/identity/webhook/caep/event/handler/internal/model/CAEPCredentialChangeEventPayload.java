package org.wso2.identity.webhook.caep.event.handler.internal.model;

import org.wso2.identity.webhook.caep.event.handler.internal.model.common.Subject;

import java.util.Map;

public class CAEPCredentialChangeEventPayload extends CAEPBaseEventPayload {

    private CAEPCredentialChangeEventPayload(Builder builder) {
        this.initiatingEntity = builder.initiatingEntity;
        this.eventTimeStamp = builder.eventTimeStamp;
        this.reasonAdmin = builder.reasonAdmin;
        this.reasonUser = builder.reasonUser;
        this.subject = builder.subject;
        this.credentialType = builder.credentialType;
        this.changeType = builder.changeType;
        this.friendlyName = builder.friendlyName;
        this.x509Issuer = builder.x509Issuer;
        this.x509Serial = builder.x509Serial;
        this.fidoAaguid = builder.fidoAaguid;
    }

    private final String credentialType;
    private final String changeType;
    private final String friendlyName;
    private final String x509Issuer;
    private final String x509Serial;
    private final String fidoAaguid;

    public String getCredentialType() {
        return credentialType;
    }

    public String getChangeType() {
        return changeType;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getX509Issuer() {
        return x509Issuer;
    }

    public String getX509Serial() {
        return x509Serial;
    }

    public String getFidoAaguid() {
        return fidoAaguid;
    }


    public static class Builder {
        private long eventTimeStamp;
        private String initiatingEntity;
        private Map<String,String> reasonAdmin;
        private Map<String,String> reasonUser;
        private Subject subject;
        private String credentialType;
        private String changeType;
        private String friendlyName;
        private String x509Issuer;
        private String x509Serial;
        private String fidoAaguid;

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

        public Builder credentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }

        public Builder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder x509Issuer(String x509Issuer) {
            this.x509Issuer = x509Issuer;
            return this;
        }

        public Builder x509Serial(String x509Serial) {
            this.x509Serial = x509Serial;
            return this;
        }

        public Builder fidoAaguid(String fidoAaguid) {
            this.fidoAaguid = fidoAaguid;
            return this;
        }

        public CAEPCredentialChangeEventPayload build() {
            return new CAEPCredentialChangeEventPayload(this);
        }
    }
}
