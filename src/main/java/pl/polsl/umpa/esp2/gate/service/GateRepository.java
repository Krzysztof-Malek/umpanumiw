package pl.polsl.umpa.esp2.gate.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.umpa.esp2.gate.GateState;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface GateRepository extends JpaRepository<GateState, Long> {
    Optional<GateState> findFirstByOrderByRecordDateDesc();
}
