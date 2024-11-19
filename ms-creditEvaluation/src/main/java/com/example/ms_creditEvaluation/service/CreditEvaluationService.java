package com.example.ms_creditEvaluation.service;

import com.example.ms_creditEvaluation.entities.CreditEvaluationEntity;
import com.example.ms_creditEvaluation.repositories.CreditEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreditEvaluationService {

    @Autowired
    private CreditEvaluationRepository creditEvaluationRepository;

    @Autowired
    private CreditRequestService creditRequestService;



    /**
     * Evaluates the credit request.
     *
     * @param evaluation the credit evaluation entity
     * @return the credit evaluation entity
     */
    public CreditEvaluationEntity evaluateCredit(CreditEvaluationEntity evaluation) {
        if (evaluation != null) {
            boolean allTrue = evaluation.isIncomeQuota() && evaluation.isCreditHistory() && evaluation.isEmploymentSeniority() &&
                    evaluation.isIncomeDebtRelation() && evaluation.isFinancingLimit() && evaluation.isApplicantAge() &&
                    evaluation.isSavingsCapacity();

            String state = allTrue ? "E4" : "E7";
            creditRequestService.editStatus(state, evaluation.getIdRquest());
        }
        if(evaluation != null){
            return creditEvaluationRepository.save(evaluation);
        }
        return null;
    }


    /**
     * Evaluates the age of the applicant.
     *
     * @param dateofbirth the date of birth of the applicant
     * @param term the term of the loan
     * @return true if the applicant is less than 70 years old, false otherwise
     */
    public boolean AgeApplicant(LocalDate dateofbirth, int term) {
        LocalDate date = LocalDate.now();
        int year = date.getYear() - dateofbirth.getYear() + term;

        if (year > 70 ) {
            return false;
        } else {
            return true;
        }
    }
}
