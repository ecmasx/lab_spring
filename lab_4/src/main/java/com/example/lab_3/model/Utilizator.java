package com.example.lab_3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "utilizatori")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeUtilizator;
    private String parola;
    private String email;
    private LocalDate dataNasterii;

    @OneToMany(mappedBy = "utilizator")
    private List<IntraJurnal> jurnale;
}