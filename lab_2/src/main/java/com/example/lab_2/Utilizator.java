package com.example.lab_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilizator {
    private String numeUtilizator;
    private String parola;
    private String email;
    private LocalDate dataNasterii;
}