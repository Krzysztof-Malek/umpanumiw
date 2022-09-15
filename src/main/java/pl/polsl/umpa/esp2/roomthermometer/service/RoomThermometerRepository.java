package pl.polsl.umpa.esp2.roomthermometer.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.umpa.esp2.roomthermometer.RoomThermometerState;

import java.util.Optional;

@Repository
public interface RoomThermometerRepository extends JpaRepository<RoomThermometerState, Long> {
    Optional<RoomThermometerState> findFirstByOrderByRecordDateDesc();
}
