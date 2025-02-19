package com.example.lab_2;
import lombok.Data;
import java.time.LocalDate;

@Data
class Utilizator {
    private String numeUtilizator;
    private String parola;
    private String email;
    private LocalDate dataNasterii;

    public Utilizator() {
    }

    public Utilizator(String numeUtilizator, String parola, String email, LocalDate dataNasterii) {
        this.numeUtilizator = numeUtilizator;
        this.parola = parola;
        this.email = email;
        this.dataNasterii = dataNasterii;
    }
}
