package com.mingeso.msorders.repositories;

import com.mingeso.msorders.entities.CreditRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRequestRepository extends JpaRepository<CreditRequestEntity, Long> {
}
