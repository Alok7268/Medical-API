package com.alok.healthmonitor.controller;

import com.alok.healthmonitor.model.HeartRate;
import com.alok.healthmonitor.service.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heartbeats")
public class HeartRateController {
    @Autowired
    private HeartRateService heartRateService;

    @PostMapping("/{patientId}")
    public ResponseEntity<HeartRate> addHeartRate(@PathVariable Long patientId, @RequestBody HeartRate heartRate) {
        return ResponseEntity.ok(heartRateService.addHeartRate(patientId, heartRate));
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<HeartRate>> getHeartRatesByPatient(@PathVariable Long patientId) {
        return ResponseEntity.ok(heartRateService.getHeartRatesByPatient(patientId));
    }
}
