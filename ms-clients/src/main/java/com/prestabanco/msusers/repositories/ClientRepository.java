package com.prestabanco.msusers.repositories;

import com.prestabanco.msusers.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    Optional<ClientEntity> findByRut(String rut);

    ClientEntity findByRutAndPassword(String rut, String password);
}