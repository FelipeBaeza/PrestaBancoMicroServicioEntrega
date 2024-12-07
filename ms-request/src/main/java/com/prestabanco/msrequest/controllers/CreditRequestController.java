package com.prestabanco.msrequest.controllers;

import com.prestabanco.msrequest.entities.CreditRequestEntity;
import com.prestabanco.msrequest.services.CreditRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/request")
public class CreditRequestController {
    @Autowired
    CreditRequestService creditRequestService;


    @PostMapping("/firstHouse")
    public ResponseEntity<?> firstHouse(
            @RequestParam("rut") String rut,
            @RequestParam("typeLoan") String typeLoan,
            @RequestParam("term") int term,
            @RequestParam("interestRate") double interestRate,
            @RequestParam("maximumAmount") int maximumAmount,
            @RequestParam("proofIncome") MultipartFile proofIncome,
            @RequestParam("creditHistory") MultipartFile creditHistory,
            @RequestParam("appraisalCertificate") MultipartFile appraisalCertificate,
            @RequestParam("bankAccountState") MultipartFile bankAccountState,
            @RequestParam("workCertificate") MultipartFile workCertificate) throws IOException {
        return ResponseEntity.ok(creditRequestService.saveFirstHouse(rut, typeLoan, term, interestRate, maximumAmount, proofIncome, creditHistory, appraisalCertificate, bankAccountState, workCertificate));
    }



    @PostMapping("/secondHouse")
    public ResponseEntity<?> secondHouse(
            @RequestParam("rut") String rut,
            @RequestParam("typeLoan") String typeLoan,
            @RequestParam("term") int term,
            @RequestParam("interestRate") double interestRate,
            @RequestParam("maximumAmount") int maximumAmount,
            @RequestParam("proofIncome") MultipartFile proofIncome,
            @RequestParam("creditHistory") MultipartFile creditHistory,
            @RequestParam("appraisalCertificate") MultipartFile appraisalCertificate,
            @RequestParam("propertyWriting") MultipartFile propertyWriting,
            @RequestParam("bankAccountState") MultipartFile bankAccountState,
            @RequestParam("workCertificate") MultipartFile workCertificate) throws IOException {
        return ResponseEntity.ok(creditRequestService.saveSecondHouse(rut, typeLoan, term, interestRate, maximumAmount, proofIncome, creditHistory, appraisalCertificate, propertyWriting, bankAccountState, workCertificate));
    }



    @PostMapping("/commercialProperty")
    public ResponseEntity<?> commercialProperty(
            @RequestParam("rut") String rut,
            @RequestParam("typeLoan") String typeLoan,
            @RequestParam("term") int term,
            @RequestParam("interestRate") double interestRate,
            @RequestParam("maximumAmount") int maximumAmount,
            @RequestParam("proofIncome") MultipartFile proofIncome,
            @RequestParam("appraisalCertificate") MultipartFile appraisalCertificate,
            @RequestParam("businessFinancialStatement") MultipartFile businessFinancialStatement,
            @RequestParam("businessPlan") MultipartFile businessPlan,
            @RequestParam("bankAccountState") MultipartFile bankAccountState,
            @RequestParam("workCertificate") MultipartFile workCertificate) throws IOException {
        return ResponseEntity.ok(creditRequestService.saveCommercialProperty(rut, typeLoan, term, interestRate, maximumAmount, proofIncome, appraisalCertificate, businessFinancialStatement, businessPlan, bankAccountState, workCertificate));
    }



    @PostMapping("/remodeling")
    public ResponseEntity<?> remodeling(
            @RequestParam("rut") String rut,
            @RequestParam("typeLoan") String typeLoan,
            @RequestParam("term") int term,
            @RequestParam("interestRate") double interestRate,
            @RequestParam("maximumAmount") int maximumAmount,
            @RequestParam("proofIncome") MultipartFile proofIncome,
            @RequestParam("appraisalCertificate") MultipartFile appraisalCertificate,
            @RequestParam("remodelingBudget") MultipartFile remodelingBudget,
            @RequestParam("bankAccountState") MultipartFile bankAccountState,
            @RequestParam("workCertificate") MultipartFile workCertificate) throws IOException {
        return ResponseEntity.ok(creditRequestService.saveRemodeling(rut, typeLoan, term, interestRate, maximumAmount, proofIncome, appraisalCertificate, remodelingBudget, bankAccountState, workCertificate));
    }


    @GetMapping("/allRquestStatus/")
    public ResponseEntity<?> allRequestStatus() {
        return ResponseEntity.ok(creditRequestService.getClientsWithCreditStatus());
    }


    @GetMapping("/{id}/documents/{documentType}")
    public ResponseEntity<byte[]> getSpecificCreditDocument(@PathVariable Long id, @PathVariable String documentType) throws IOException {
        Optional<byte[]> documentBytesOpt = creditRequestService.getCreditDocumentByType(id, documentType);

        if (documentBytesOpt.isPresent()) {
            byte[] documentBytes = documentBytesOpt.get();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", documentType + ".pdf");
            headers.setContentLength(documentBytes.length);

            return new ResponseEntity<>(documentBytes, headers, HttpStatus.OK);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/getRequest/{id}")
    public ResponseEntity<?> getRequest(@PathVariable Long id) {
        return ResponseEntity.ok(creditRequestService.getRequest(id));
    }


    @PutMapping("/EditStatus/{id}/{state}")
    public ResponseEntity<?> editStatus(@PathVariable String state, @PathVariable Long id) {
        return ResponseEntity.ok(creditRequestService.editStatus(state, id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRequest(@PathVariable Long id) {
        return ResponseEntity.ok(creditRequestService.deleteRequest(id));
    }


    @GetMapping("/findRequestById/{id}")
    public ResponseEntity<?> findRequestById(@PathVariable Long id) {
        return ResponseEntity.ok(creditRequestService.findRequestById(id));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(creditRequestService.findById(id));
    }
}
