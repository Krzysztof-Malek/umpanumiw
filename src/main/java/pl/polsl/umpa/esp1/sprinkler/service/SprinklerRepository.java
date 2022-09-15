package pl.polsl.umpa.esp1.sprinkler.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.umpa.esp1.sprinkler.SprinklerState;

import java.util.Optional;

@Repository
public interface SprinklerRepository extends JpaRepository<SprinklerState, Long> {
    Optional<SprinklerState> findFirstByOrderByRecordDateDesc();
}
