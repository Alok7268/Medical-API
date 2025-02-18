package com.alok.healthmonitor.controller;

import com.alok.healthmonitor.model.Patient;
import com.alok.healthmonitor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/{userId}")
    public ResponseEntity<Patient> addPatient(@PathVariable Long userId, @RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.addPatient(patient, userId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Patient>> getPatientsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(patientService.getPatientsByUser(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }
}
