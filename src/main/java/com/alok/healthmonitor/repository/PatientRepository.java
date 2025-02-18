package com.alok.healthmonitor.repository;

import com.alok.healthmonitor.model.Patient;
import com.alok.healthmonitor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByUser(User user);
}
