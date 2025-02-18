package com.alok.healthmonitor.service;

import com.alok.healthmonitor.model.Patient;
import com.alok.healthmonitor.model.User;
import com.alok.healthmonitor.repository.PatientRepository;
import com.alok.healthmonitor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private UserRepository userRepository;

    public Patient addPatient(Patient patient, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        patient.setUser(user);
        return patientRepository.save(patient);
    }

    public List<Patient> getPatientsByUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return patientRepository.findByUser(user);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }
}
