package pl.polsl.umpa;

import com.fasterxml.jackson.annotation.JsonInclude;
import pl.polsl.umpa.AbstractSmartHomeComponentState.ComponentState;
import pl.polsl.umpa.AbstractSmartHomeComponentState.Unit;

@JsonInclude
public record ThermometerReadResponse(double temperature, Unit unit, ComponentState componentState) {
}
