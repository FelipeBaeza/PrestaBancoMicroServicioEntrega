package com.prestabanco.mstracking.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;
    private String lastName;
    private String rut;
    private String password;
    private LocalDate dateOfBirth;
    private String email;

    private String ListRequestId;


}
