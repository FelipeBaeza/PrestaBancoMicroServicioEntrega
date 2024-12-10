package com.mingeso.msorders.repositories;

import com.mingeso.msorders.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    Optional<ClientEntity> findByRut(String rut);

    ClientEntity findByRutAndPassword(String rut, String password);
}

