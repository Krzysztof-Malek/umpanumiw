package pl.polsl.umpa.esp1.poolthermometer;

import pl.polsl.umpa.AbstractThermometerComponentState;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pool_thermometer_readings")
public class PoolThermometerState extends AbstractThermometerComponentState {
    public PoolThermometerState(Date recordDate) {
        super(recordDate);
    }

    public PoolThermometerState() {
    }
}
