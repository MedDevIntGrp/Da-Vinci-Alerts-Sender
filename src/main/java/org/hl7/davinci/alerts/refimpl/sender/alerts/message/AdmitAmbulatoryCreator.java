package org.hl7.davinci.alerts.refimpl.sender.alerts.message;

import org.hl7.davinci.alerts.refimpl.sender.alerts.AlertType;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Component;

@Component(value = AlertType.ADMIT_AMBULATORY)
public class AdmitAmbulatoryCreator extends BaseMessageCreator {

    @Override
    public Bundle createMessageBundle(Patient patient) {
        return createDemoProcessMessage(
                patient,
                "AMB",
                "ambulatory"
        );
    }
}
