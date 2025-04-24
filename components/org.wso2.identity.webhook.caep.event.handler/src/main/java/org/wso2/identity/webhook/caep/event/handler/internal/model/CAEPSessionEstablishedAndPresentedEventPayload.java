package org.wso2.identity.webhook.caep.event.handler.internal.model;

import org.wso2.carbon.identity.application.authentication.framework.context.AuthenticationContext;
import org.wso2.identity.webhook.caep.event.handler.internal.model.common.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CAEPSessionEstablishedAndPresentedEventPayload extends CAEPBaseEventPayload {
    private CAEPSessionEstablishedAndPresentedEventPayload(Builder builder) {
        this.initiatingEntity = builder.initiatingEntity;
        this.eventTimeStamp = builder.eventTimeStamp;
        this.reasonAdmin = builder.reasonAdmin;
        this.reasonUser = builder.reasonUser;
        this.subject = builder.subject;
        this.ips = builder.ips;
        this.fpUa = builder.fpUa;
        this.acr = builder.acr;
        this.amr = builder.amr;
        this.extId = builder.extId;
    }

    private List<String> ips = new ArrayList<>();
    private final String fpUa;
    private final AuthenticationContext acr;
    private List<String> amr = new ArrayList<>();
    private final String extId;

    public String getExtId() {
        return extId;
    }

    public List<String> getAmr() {
        return amr;
    }

    public AuthenticationContext getAcr() {
        return acr;
    }

    public String getFpUa() {
        return fpUa;
    }

    public List<String> getIps() {
        return ips;
    }


    public static class Builder {
        private long eventTimeStamp;
        private String initiatingEntity;
        private Map<String,String> reasonAdmin;
        private Map<String,String> reasonUser;
        private Subject subject;
        private List<String> ips;
        private String fpUa;
        private AuthenticationContext acr;
        private List<String> amr;
        private String extId;

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

        public Builder ips(List<String> ips) {
            this.ips = ips;
            return this;
        }

        public Builder fpUa(String fpUa) {
            this.fpUa = fpUa;
            return this;
        }

        public Builder amr(List<String> amr) {
            this.amr = amr;
            return this;
        }

        public Builder extId(String extId) {
            this.extId = extId;
            return this;
        }

        public CAEPSessionEstablishedAndPresentedEventPayload build() {
            return new CAEPSessionEstablishedAndPresentedEventPayload(this);
        }

    }
}
