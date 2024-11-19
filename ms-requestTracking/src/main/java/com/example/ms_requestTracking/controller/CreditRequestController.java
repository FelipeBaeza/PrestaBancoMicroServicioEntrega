package com.example.ms_requestTracking.controller;

import com.example.ms_requestTracking.service.CreditRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/requestTracking")
public class CreditRequestController {

    @Autowired
    private CreditRequestService clientService;

    /**
     * statusRequest method to get the status of a request
     * @param rut
     * @return the status of the request
     */

    @GetMapping("/statusRequest/{rut}")
    public ResponseEntity<?> statusRequest(@PathVariable String rut) {
        return ResponseEntity.ok(clientService.statusRequestClient(rut));
    }
}
