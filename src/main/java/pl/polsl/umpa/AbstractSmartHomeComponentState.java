package pl.polsl.umpa;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractSmartHomeComponentState {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "component_sequence")
    @SequenceGenerator(name = "component_sequence", sequenceName = "component_sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date recordDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "component_state", nullable = false)
    private ComponentState componentState;

    public enum ComponentState {
        ON,
        OFF,
        OPENED,
        CLOSED

    }

    public enum Unit {
        CELSIUS {
            @Override
            public String toString() {
                return "°C";
            }
        }, FAHRENHEIT {
            @Override
            public String toString() {
                return "°F";
            }
        };
    }

    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public AbstractSmartHomeComponentState() {
    }

    public AbstractSmartHomeComponentState(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public ComponentState getState() {
        return componentState;
    }

    public void setState(ComponentState componentState) {
        this.componentState = componentState;
    }
}
