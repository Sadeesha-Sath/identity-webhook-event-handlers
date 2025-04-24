package org.wso2.identity.webhook.common.event.handler.api.builder;

import org.wso2.carbon.identity.event.IdentityEventConstants.EventSchema;
import org.wso2.carbon.identity.event.IdentityEventException;
import org.wso2.identity.event.common.publisher.model.EventPayload;
import org.wso2.identity.webhook.common.event.handler.api.model.EventData;

public interface SessionEventPayloadBuilder {

    /**
     * Build the Session Terminate event.
     *
     * @param eventData Event data.
     * @return Event payload.
     */
    EventPayload buildSessionTerminateEvent(EventData eventData) throws IdentityEventException;

    /**
     * Build the Session Create event.
     *
     * @param eventData Event data.
     * @return Event payload.
     */
    EventPayload buildSessionCreateEvent(EventData eventData) throws IdentityEventException;

    /**
     * Build the Session Update event.
     *
     * @param eventData Event data.
     * @return Event payload.
     */
    EventPayload buildSessionUpdateEvent(EventData eventData) throws IdentityEventException;

    /**
     * Build the Session Expire event.
     *
     * @param eventData Event data.
     * @return Event payload.
     */
    EventPayload buildSessionExpireEvent(EventData eventData) throws IdentityEventException;

    /**
     * Build the Session Extend event.
     *
     * @param eventData Event data.
     * @return Event payload.
     */
    EventPayload buildSessionExtendEvent(EventData eventData) throws IdentityEventException;


    /**
     * Get the event schema type.
     *
     * @return Event schema type.
     */
    EventSchema getEventSchemaType();
}
