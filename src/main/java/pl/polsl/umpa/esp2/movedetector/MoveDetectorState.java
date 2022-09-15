package pl.polsl.umpa.esp2.movedetector;

import pl.polsl.umpa.AbstractSmartHomeComponentState;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "move_detector_readings")
public class MoveDetectorState extends AbstractSmartHomeComponentState {

    @Column(name = "activated", nullable = false)
    private boolean activated;
    public MoveDetectorState(Date recordDate) { super(recordDate); }

    public MoveDetectorState() {
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
