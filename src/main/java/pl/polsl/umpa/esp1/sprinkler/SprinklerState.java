package pl.polsl.umpa.esp1.sprinkler;

import pl.polsl.umpa.AbstractSmartHomeComponentState;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sprinkler_history")
public class SprinklerState extends AbstractSmartHomeComponentState {

    @Enumerated(EnumType.STRING)
    @Column(name = "week_day", nullable = false)
    private WeekDay weekDay;

    @Column(name = "cycle_start", nullable = false)
    private float start;

    @Column(name = "cycle_end", nullable = false)
    private float end;

    public SprinklerState(Date recordDate) {
        super(recordDate);
    }

    public SprinklerState() {
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public float getEnd() {
        return end;
    }

    public void setEnd(float end) {
        this.end = end;
    }
}
