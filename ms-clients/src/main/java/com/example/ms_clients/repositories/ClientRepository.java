package com.example.ms_clients.repositories;

import com.example.ms_clients.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    Optional<ClientEntity> findByRut(String rut);

    ClientEntity findByRutAndPassword(String rut, String password);
}
