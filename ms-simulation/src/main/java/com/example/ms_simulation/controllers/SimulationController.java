package com.example.ms_simulation.controllers;

import com.example.ms_simulation.services.SimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/simulation")
public class SimulationController {

    @Autowired
    private SimulationService simulationService;

    @GetMapping("/calculate/{amount}/{interestRate}/{term}")
    public ResponseEntity<?> simulation(@PathVariable int amount, @PathVariable double interestRate, @PathVariable int term) {
        return ResponseEntity.ok(simulationService.simulation(amount, interestRate, term));
    }
}
