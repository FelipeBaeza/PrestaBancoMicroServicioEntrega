package com.prestabanco.msevaluation.repositories;

import com.prestabanco.msevaluation.entities.CreditEvaluationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreditEvaluationRepository extends JpaRepository<CreditEvaluationEntity, Long> {
}
