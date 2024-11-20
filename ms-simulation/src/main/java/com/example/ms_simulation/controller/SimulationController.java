package com.example.ms_simulation.controller;

import com.example.ms_simulation.service.SimulationService;
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
    private SimulationService clientService;


    /**
     * Simulates a loan calculation.
     *
     * @param amount the amount of the loan
     * @param interestRate the interest rate of the loan
     * @param term the term of the loan
     * @return the monthly payment of the loan
     */
    @GetMapping("/calculate/{amount}/{interestRate}/{term}")
    public ResponseEntity<?> simulation(@PathVariable int amount, @PathVariable double interestRate, @PathVariable int term) {
        return ResponseEntity.ok(clientService.simulation(amount, interestRate, term));
    }
}
