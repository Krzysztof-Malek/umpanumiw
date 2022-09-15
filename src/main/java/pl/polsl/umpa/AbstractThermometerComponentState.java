package pl.polsl.umpa;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AbstractThermometerComponentState extends AbstractSmartHomeComponentState {

    @Column(name = "temperature", nullable = false)
    private double temperature;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit", nullable = false)
    private Unit unit;

    public AbstractThermometerComponentState() {
    }

    public AbstractThermometerComponentState(Date recordDate) {
        super(recordDate);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
