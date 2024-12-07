package com.prestabanco.mstracking.controllers;

import com.prestabanco.mstracking.entities.CreditRequestEntity;
import com.prestabanco.mstracking.services.RequestTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/tracking")
public class RequestTrackingController {

    @Autowired
    private RequestTrackingService requestTrackingService;

    @GetMapping("/statusRequest/{rut}")
    public ResponseEntity<?> statusRequest(@PathVariable String rut) {
        return ResponseEntity.ok(requestTrackingService.statusRequestClient(rut));
    }
}
