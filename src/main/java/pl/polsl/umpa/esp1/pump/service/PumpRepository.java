package pl.polsl.umpa.esp1.pump.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.umpa.esp1.pump.PumpState;

import java.util.Optional;

@Repository
interface PumpRepository extends JpaRepository<PumpState, Long> {
    Optional<PumpState> findFirstByOrderByRecordDateDesc();
}
