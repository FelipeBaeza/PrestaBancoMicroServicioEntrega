package com.prestabanco.mstracking.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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


    public String getTypeLoan() {
        return typeLoan;
    }

    public void setTypeLoan(String typeLoan) {
        this.typeLoan = typeLoan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public byte[] getProofIncome() {
        return proofIncome;
    }

    public void setProofIncome(byte[] proofIncome) {
        this.proofIncome = proofIncome;
    }

    public byte[] getAppraisalCertificate() {
        return appraisalCertificate;
    }

    public void setAppraisalCertificate(byte[] appraisalCertificate) {
        this.appraisalCertificate = appraisalCertificate;
    }

    public byte[] getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(byte[] creditHistory) {
        this.creditHistory = creditHistory;
    }

    public byte[] getPropertyWriting() {
        return propertyWriting;
    }

    public void setPropertyWriting(byte[] propertyWriting) {
        this.propertyWriting = propertyWriting;
    }

    public byte[] getBusinessFinancialStatement() {
        return businessFinancialStatement;
    }

    public void setBusinessFinancialStatement(byte[] businessFinancialStatement) {
        this.businessFinancialStatement = businessFinancialStatement;
    }

    public byte[] getBusinessPlan() {
        return businessPlan;
    }

    public void setBusinessPlan(byte[] businessPlan) {
        this.businessPlan = businessPlan;
    }

    public byte[] getBankAccountState() {
        return bankAccountState;
    }

    public void setBankAccountState(byte[] bankAccountState) {
        this.bankAccountState = bankAccountState;
    }

    public byte[] getRemodelingBudget() {
        return remodelingBudget;
    }

    public void setRemodelingBudget(byte[] remodelingBudget) {
        this.remodelingBudget = remodelingBudget;
    }

    public byte[] getWorkCertificate() {
        return workCertificate;
    }

    public void setWorkCertificate(byte[] workCertificate) {
        this.workCertificate = workCertificate;
    }

    public String getStateRequest() {
        return StateRequest;
    }

    public void setStateRequest(String stateRequest) {
        StateRequest = stateRequest;
    }
}
