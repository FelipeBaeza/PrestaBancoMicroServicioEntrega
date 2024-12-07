package com.prestabanco.mstotalcost.controllers;

import com.prestabanco.mstotalcost.services.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/totalcost")
public class CostController {

    @Autowired
    private CostService costService;

    @GetMapping("/total/{id}")
    public ResponseEntity<?> totalCosts(@PathVariable Long id) {
        return ResponseEntity.ok(costService.calculateTotalCosts(id));
    }
}
