package org.wso2.identity.webhook.common.event.handler.internal.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.core.bean.context.MessageContext;
import org.wso2.carbon.identity.event.IdentityEventConstants;
import org.wso2.carbon.identity.event.IdentityEventException;
import org.wso2.carbon.identity.event.bean.IdentityEventMessageContext;
import org.wso2.carbon.identity.event.event.Event;
import org.wso2.carbon.identity.event.handler.AbstractEventHandler;
import org.wso2.identity.event.common.publisher.model.EventPayload;
import org.wso2.identity.webhook.common.event.handler.internal.util.EventConfigManager;
import org.wso2.identity.webhook.common.event.handler.internal.util.PayloadBuilderFactory;
import org.wso2.identity.webhook.common.event.handler.api.builder.CredentialEventPayloadBuilder;
import org.wso2.identity.webhook.common.event.handler.internal.constant.Constants;
import org.wso2.identity.webhook.common.event.handler.api.model.EventData;
import org.wso2.identity.webhook.common.event.handler.internal.config.EventPublisherConfig;
import org.wso2.identity.webhook.common.event.handler.internal.util.EventHookHandlerInternalUtils;

public class CredentialEventHookHandler extends AbstractEventHandler {

    private static final Log log = LogFactory.getLog(CredentialEventHookHandler.class);
    private final EventHookHandlerInternalUtils eventHookHandlerInternalUtils;
    private final EventConfigManager eventConfigManager;

    public CredentialEventHookHandler(EventHookHandlerInternalUtils eventHookHandlerInternalUtils, EventConfigManager eventConfigManager) {
        this.eventHookHandlerInternalUtils = eventHookHandlerInternalUtils;
        this.eventConfigManager = eventConfigManager;
    }

    @Override
    public String getName() {
        return Constants.CREDENTIAL_EVENT_HOOK_NAME;
    }

    @Override
    public boolean canHandle(MessageContext messageContext) throws IdentityRuntimeException {

        IdentityEventMessageContext identityContext = (IdentityEventMessageContext) messageContext;
        String eventName = identityContext.getEvent().getEventName();

        boolean canHandle = isSupportedEvent(eventName);
        if (canHandle) {
            log.debug(eventName + " event can be handled.");
        } else {
            log.debug(eventName + " event cannot be handled.");
        }
        return canHandle;
    }

    private boolean isSupportedEvent(String eventName) {

        return IdentityEventConstants.EventName.POST_UPDATE_CREDENTIAL.name().equals(eventName) ||
                IdentityEventConstants.EventName.POST_UPDATE_CREDENTIAL_BY_ADMIN.name().equals(eventName);
    }

    @Override
    public void handleEvent(Event event) throws IdentityEventException {

        EventData eventData = eventHookHandlerInternalUtils.buildEventDataProvider(event);

        IdentityEventConstants.EventSchema schema = IdentityEventConstants.EventSchema.CAEP;
        CredentialEventPayloadBuilder payloadBuilder = PayloadBuilderFactory
                .getCredentialEventPayloadBuilder(schema);

        EventPublisherConfig credentialEventPublisherConfig;

        try {
            credentialEventPublisherConfig = getEventPublisherConfigForTenant(
                    (String) eventData.getSessionContext().getProperty("tenantDomain"), event.getEventName(), eventConfigManager);

            EventPayload eventPayload = null;
            String eventUri = null;


        } catch (Exception e) {
            throw new IdentityEventException("Error occurred while building event payload", e);
        }
    }
}
