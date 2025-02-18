package com.example.lab_2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
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


    @Override
    public String toString() {
        return "Utilizator{" +
                "numeUtilizator='" + numeUtilizator + '\'' +
                ", parola='" + parola + '\'' +
                ", email='" + email + '\'' +
                ", dataNasterii=" + dataNasterii +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilizator that = (Utilizator) o;
        return Objects.equals(numeUtilizator, that.numeUtilizator) && Objects.equals(parola, that.parola) && Objects.equals(email, that.email) && Objects.equals(dataNasterii, that.dataNasterii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeUtilizator, parola, email, dataNasterii);
    }
}
