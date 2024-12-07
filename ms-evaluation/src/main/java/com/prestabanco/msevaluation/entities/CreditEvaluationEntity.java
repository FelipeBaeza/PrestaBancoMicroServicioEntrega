package com.prestabanco.msevaluation.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditEvaluationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Datos de la evaluación
    private boolean incomeQuota;
    private boolean creditHistory;
    private boolean employmentSeniority;
    private boolean incomeDebtRelation;
    private boolean financingLimit;
    private boolean applicantAge;
    private boolean savingsCapacity;

    private long idRquest;
}