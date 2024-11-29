package com.example.ms_totalCosts.entitites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CreditRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // datos prestamo
    String typeLoan;
    int term;
    double interestRate;
    int maximumAmount;

    // Documentos requeridos
    @Lob
    private byte[] proofIncome;
    @Lob
    private byte[] appraisalCertificate;
    @Lob
    private byte[] creditHistory;
    @Lob
    private byte[] propertyWriting;
    @Lob
    private byte[] businessFinancialStatement;
    @Lob
    private byte[] businessPlan;
    @Lob
    private byte[] remodelingBudget;
    @Lob
    private byte[] bankAccountState;
    @Lob
    private byte[] workCertificate;

    private String StateRequest;
}
