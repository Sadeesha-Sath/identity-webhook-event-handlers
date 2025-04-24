package org.wso2.identity.webhook.common.event.handler.api.builder;

import org.wso2.carbon.identity.event.IdentityEventConstants;
import org.wso2.identity.event.common.publisher.model.EventPayload;
import org.wso2.identity.webhook.common.event.handler.api.model.EventData;

public interface CredentialEventPayloadBuilder {

    EventPayload buildCredentialChange(EventData eventData);

    IdentityEventConstants.EventSchema getEventSchemaType();
}
