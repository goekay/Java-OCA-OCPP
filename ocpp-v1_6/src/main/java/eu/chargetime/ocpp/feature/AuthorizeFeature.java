package eu.chargetime.ocpp.feature;

import eu.chargetime.ocpp.feature.profile.Profile;
import eu.chargetime.ocpp.model.AuthorizeConfirmation;
import eu.chargetime.ocpp.model.AuthorizeRequest;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.Request;

/**
 * Created by Thomas Volden on 28-Apr-16.
 */
public class AuthorizeFeature extends Feature {

    public AuthorizeFeature(Profile ownerProfile) {
        super(ownerProfile);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return AuthorizeRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return AuthorizeConfirmation.class;
    }

    @Override
    public String getAction() {
        return "Authorize";
    }
}