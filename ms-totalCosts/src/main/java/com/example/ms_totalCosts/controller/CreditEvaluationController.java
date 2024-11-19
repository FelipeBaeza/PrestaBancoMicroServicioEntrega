package com.example.ms_totalCosts.controller;

import com.example.ms_totalCosts.service.CreditEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/totalCosts")
public class CreditEvaluationController {

    @Autowired
    private CreditEvaluationService creditEvaluationService;

    @GetMapping("/total/{id}")
    public ResponseEntity<?> totalCosts(@PathVariable Long id) {
        return ResponseEntity.ok(creditEvaluationService.calculateTotalCosts(id));
    }
}
