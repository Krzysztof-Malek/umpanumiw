package pl.polsl.umpa.esp2.movedetector.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.polsl.umpa.esp2.movedetector.MoveDetectorState;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MoveDetectorRepository extends JpaRepository<MoveDetectorState, Long> {

    List<MoveDetectorState> findMoveDetectorStatesByRecordDateBetween(Date start, Date end);

    Optional<MoveDetectorState> findFirstByOrderByRecordDateDesc();
}
