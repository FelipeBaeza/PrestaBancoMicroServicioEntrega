package com.example.ms_clients.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
