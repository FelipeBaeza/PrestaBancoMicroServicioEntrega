package com.prestabanco.msevaluation.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
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


    public boolean isIncomeQuota() {
        return incomeQuota;
    }

    public void setIncomeQuota(boolean incomeQuota) {
        this.incomeQuota = incomeQuota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(boolean creditHistory) {
        this.creditHistory = creditHistory;
    }

    public boolean isEmploymentSeniority() {
        return employmentSeniority;
    }

    public void setEmploymentSeniority(boolean employmentSeniority) {
        this.employmentSeniority = employmentSeniority;
    }

    public boolean isIncomeDebtRelation() {
        return incomeDebtRelation;
    }

    public void setIncomeDebtRelation(boolean incomeDebtRelation) {
        this.incomeDebtRelation = incomeDebtRelation;
    }

    public boolean isFinancingLimit() {
        return financingLimit;
    }

    public void setFinancingLimit(boolean financingLimit) {
        this.financingLimit = financingLimit;
    }

    public boolean isApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(boolean applicantAge) {
        this.applicantAge = applicantAge;
    }

    public boolean isSavingsCapacity() {
        return savingsCapacity;
    }

    public void setSavingsCapacity(boolean savingsCapacity) {
        this.savingsCapacity = savingsCapacity;
    }

    public long getIdRquest() {
        return idRquest;
    }

    public void setIdRquest(long idRquest) {
        this.idRquest = idRquest;
    }
}