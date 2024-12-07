package com.prestabanco.mstotalcost.services;

import com.prestabanco.mstotalcost.clients.RequestFeignClient;
import com.prestabanco.mstotalcost.clients.SimulationFeignClient;
import com.prestabanco.mstotalcost.entities.CreditRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostService {

    @Autowired
    private RequestFeignClient creditRequestFeignClient;

    @Autowired
    private SimulationFeignClient simulationFeignClient;

    public int calculateTotalCosts(Long id) {
        // Step 1: Calculate Monthly Payment
        CreditRequestEntity request = creditRequestFeignClient.findById(id);
        if (request == null) {
            return 0; // Return 0 if the request is not found
        }
        int loanAmount = request.getMaximumAmount(); // 100,000,000
        int termInYears = request.getTerm(); // 20 years
        double annualInterestRate = request.getInterestRate(); // 4.5%
        double monthlyInterestRate = annualInterestRate / 12 / 100; // 0.375%

        double monthlyPayment = simulationFeignClient.simulation(loanAmount, annualInterestRate, termInYears);

        // Step 2: Calculate Insurance Costs
        double monthlyLifeInsurance = loanAmount * 0.0003; // 0.03% of loan amount
        double monthlyFireInsurance = 20000; // Fixed at 20,000 per month

        // Step 3: Calculate Administration Commission
        double administrationCommission = loanAmount * 0.01; // 1% of loan amount

        // Step 4: Calculate Monthly Total Cost
        double monthlyCost = monthlyPayment + monthlyLifeInsurance + monthlyFireInsurance;

        // Step 5: Calculate Total Cost for the Entire Loan Term
        double totalCost = (monthlyCost * termInYears * 12) + administrationCommission;

        return (int) totalCost;
    }
}
