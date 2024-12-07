package com.prestabanco.mssimulation.controllers;

import com.prestabanco.mssimulation.services.CreditSimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/simulation")
public class CreditSimulationController {

    @Autowired
    private CreditSimulationService creditSimulationService;

    @GetMapping("/calculate/{amount}/{interestRate}/{term}")
    public ResponseEntity<?> simulation(@PathVariable int amount, @PathVariable double interestRate, @PathVariable int term) {
        return ResponseEntity.ok(creditSimulationService.simulation(amount, interestRate, term));
    }
}
