package pl.polsl.umpa.esp1.pump;

import pl.polsl.umpa.AbstractSmartHomeComponentState;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pump_history")
public class PumpState extends AbstractSmartHomeComponentState {

    public PumpState(Date recordDate) {
        super(recordDate);
    }

    public PumpState() {
    }
}
