package com.alok.healthmonitor.service;

import com.alok.healthmonitor.model.HeartRate;
import com.alok.healthmonitor.model.Patient;
import com.alok.healthmonitor.repository.HeartRateRepository;
import com.alok.healthmonitor.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HeartRateService {
    @Autowired
    private HeartRateRepository heartRateRepository;

    @Autowired
    private PatientRepository patientRepository;

    public HeartRate addHeartRate(Long patientId, HeartRate heartRate) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        heartRate.setPatient(patient);
        heartRate.setTimestamp(LocalDateTime.now());
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRatesByPatient(Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return heartRateRepository.findByPatient(patient);
    }
}
