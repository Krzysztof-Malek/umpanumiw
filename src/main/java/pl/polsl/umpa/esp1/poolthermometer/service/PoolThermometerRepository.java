package pl.polsl.umpa.esp1.poolthermometer.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.umpa.esp1.poolthermometer.PoolThermometerState;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
interface PoolThermometerRepository extends JpaRepository<PoolThermometerState, Long> {
    List<PoolThermometerState> findThermometerDegreesByRecordDateBetween(Date start, Date end);

    Optional<PoolThermometerState> findFirstByOrderByRecordDateDesc();
}
