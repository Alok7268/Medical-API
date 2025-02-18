package com.alok.healthmonitor.repository;

import com.alok.healthmonitor.model.HeartRate;
import com.alok.healthmonitor.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {
    List<HeartRate> findByPatient(Patient patient);
}
