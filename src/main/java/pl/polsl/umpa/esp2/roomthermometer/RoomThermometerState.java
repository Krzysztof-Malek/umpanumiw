package pl.polsl.umpa.esp2.roomthermometer;

import pl.polsl.umpa.AbstractThermometerComponentState;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "room_thermometer_readings")
public class RoomThermometerState extends AbstractThermometerComponentState {
    public RoomThermometerState(Date recordDate) {
        super(recordDate);
    }

    public RoomThermometerState() {
    }
}
