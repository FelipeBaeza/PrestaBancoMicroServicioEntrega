package com.example.ms_creditRequest.repositories;

import com.example.ms_creditRequest.entities.CreditRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRequestRepository extends JpaRepository<CreditRequestEntity, Long> {
}
