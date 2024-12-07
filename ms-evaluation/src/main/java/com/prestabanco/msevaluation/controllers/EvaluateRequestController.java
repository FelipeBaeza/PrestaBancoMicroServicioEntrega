package com.prestabanco.msevaluation.controllers;

import com.prestabanco.msevaluation.entities.CreditEvaluationEntity;
import com.prestabanco.msevaluation.services.EvaluateRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/evaluation")
public class EvaluateRequestController {

    @Autowired
    private EvaluateRequestService evaluateRequestService;

    @PostMapping("/dataEvaluation")
    public ResponseEntity<?> dataEvaluation(@RequestBody CreditEvaluationEntity evaluation) {
        return ResponseEntity.ok(evaluateRequestService.evaluateCredit(evaluation));
    }
}
