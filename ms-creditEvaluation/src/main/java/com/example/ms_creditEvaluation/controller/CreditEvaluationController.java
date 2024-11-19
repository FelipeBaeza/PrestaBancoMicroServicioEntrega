package com.example.ms_creditEvaluation.controller;

import com.example.ms_creditEvaluation.entities.CreditEvaluationEntity;
import com.example.ms_creditEvaluation.service.CreditEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/creditEvaluation")
public class CreditEvaluationController {

    @Autowired
    private CreditEvaluationService creditEvaluationService;


    @PostMapping("/dataEvaluation")
    public ResponseEntity<?> dataEvaluation(@RequestBody CreditEvaluationEntity evaluation) {
        return ResponseEntity.ok(creditEvaluationService.evaluateCredit(evaluation));
    }
}
