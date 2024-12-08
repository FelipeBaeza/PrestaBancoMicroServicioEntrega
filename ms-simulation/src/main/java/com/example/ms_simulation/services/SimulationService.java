package com.example.ms_simulation.services;

import org.springframework.stereotype.Service;

@Service
public class SimulationService {

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
