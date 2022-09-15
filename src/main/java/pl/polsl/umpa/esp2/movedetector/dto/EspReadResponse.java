package pl.polsl.umpa.esp2.movedetector.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import pl.polsl.umpa.AbstractSmartHomeComponentState;
import pl.polsl.umpa.AbstractSmartHomeComponentState.ComponentState;

@JsonInclude
public record EspReadResponse(ComponentState componentState, boolean activated) {
}
