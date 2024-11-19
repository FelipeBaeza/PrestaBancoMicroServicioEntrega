package com.example.ms_simulation.service;

import org.springframework.stereotype.Service;

@Service
public class SimulationService {

    /**
     * Simulates a loan calculation.
     * @param amount the amount of the loan
     * @param interestRate the interest rate of the loan
     * @param term the term of the loan
     * @return the monthly payment of the loan
     */
    public int simulation(int amount, double interestRate, int term) {
        // Monto del préstamo
        double p = amount;

        // Tasa de interés mensual
        double r = interestRate / 12 / 100;

        // Plazo en meses
        double n = term * 12;

        // Fórmula para calcular la cuota mensual
        int result = (int) (p * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));

        return result;
    }
}
