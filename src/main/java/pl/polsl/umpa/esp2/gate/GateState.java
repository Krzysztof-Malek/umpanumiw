package pl.polsl.umpa.esp2.gate;

import pl.polsl.umpa.AbstractSmartHomeComponentState;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "gate_history")
public class GateState extends AbstractSmartHomeComponentState {
    public GateState(Date date){ super(date); }

    public GateState() {
    }
}
