package com.mingeso.msorders.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "form_credit")
@NoArgsConstructor
@AllArgsConstructor
public class CreditRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // datos prestamo
    private String typeLoan;
    private int term;
    private double interestRate;
    private int maximumAmount;

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

    private String stateRequest;

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

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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

    public byte[] getRemodelingBudget() {
        return remodelingBudget;
    }

    public void setRemodelingBudget(byte[] remodelingBudget) {
        this.remodelingBudget = remodelingBudget;
    }

    public byte[] getBankAccountState() {
        return bankAccountState;
    }

    public void setBankAccountState(byte[] bankAccountState) {
        this.bankAccountState = bankAccountState;
    }

    public byte[] getWorkCertificate() {
        return workCertificate;
    }

    public void setWorkCertificate(byte[] workCertificate) {
        this.workCertificate = workCertificate;
    }

    public String getStateRequest() {
        return stateRequest;
    }

    public void setStateRequest(String stateRequest) {
        this.stateRequest = stateRequest;
    }
}
