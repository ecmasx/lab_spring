package com.example.lab_1;

import java.time.LocalDate;
import java.util.Objects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JurnalPersonal {

    public static void main(String[] args) {
        SpringApplication.run(JurnalPersonal.class, args);

        IntrareJurnal intrare1 = new IntrareJurnal(LocalDate.now(), "Ziua 1", "Am avut o zi productiva.", "Bucuros", 8);
        IntrareJurnal intrare2 = new IntrareJurnal(LocalDate.of(2024, 10, 27), "Ziua 2", "M-am simtit putin obosit azi.", "Neutru", 5);
        IntrareJurnal intrare3 = new IntrareJurnal();
        intrare3.setTitlu("Ziua 3");
        intrare3.setContinut("Am lucrat la proiectul nou.");
        intrare3.setStareEmotionala("Entuziasmat");
        intrare3.setNivelEnergie(7);


        System.out.println(intrare1);
        System.out.println(intrare2);
        System.out.println(intrare3);


        Utilizator user1 = new Utilizator("JavaJavist", "password123", "java.javist@gmail.com", LocalDate.of(1990, 5, 15));
        System.out.println(user1);

        Utilizator user2 = new Utilizator();
        user2.setNumeUtilizator("JavaJavist");
        user2.setParola("paswrrods");
        user2.setEmail("temp@mail.com");
        user2.setDataNasterii(LocalDate.of(1995, 11, 2));
        System.out.println(user2);


    }

}

class IntrareJurnal {
    private LocalDate data;
    private String titlu;
    private String continut;
    private String stareEmotionala;
    private int nivelEnergie;

    public IntrareJurnal(LocalDate data, String titlu, String continut, String stareEmotionala, int nivelEnergie) {
        this.data = data;
        this.titlu = titlu;
        this.continut = continut;
        this.stareEmotionala = stareEmotionala;
        this.nivelEnergie = nivelEnergie;
    }

    public IntrareJurnal() {
        this.data = LocalDate.now();
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public String getStareEmotionala() {
        return stareEmotionala;
    }

    public void setStareEmotionala(String stareEmotionala) {
        this.stareEmotionala = stareEmotionala;
    }

    public int getNivelEnergie() {
        return nivelEnergie;
    }

    public void setNivelEnergie(int nivelEnergie) {
        this.nivelEnergie = nivelEnergie;
    }

    @Override
    public String toString() {
        return "IntrareJurnal{" +
                "data=" + data +
                ", titlu='" + titlu + '\'' +
                ", continut='" + continut + '\'' +
                ", stareEmotionala='" + stareEmotionala + '\'' +
                ", nivelEnergie=" + nivelEnergie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntrareJurnal that = (IntrareJurnal) o;
        return nivelEnergie == that.nivelEnergie && Objects.equals(data, that.data) && Objects.equals(titlu, that.titlu) && Objects.equals(continut, that.continut) && Objects.equals(stareEmotionala, that.stareEmotionala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, titlu, continut, stareEmotionala, nivelEnergie);
    }
}


class Utilizator {
    private String numeUtilizator;
    private String parola;
    private String email;
    private LocalDate dataNasterii;

    public Utilizator() {}

    public Utilizator(String numeUtilizator, String parola, String email, LocalDate dataNasterii) {
        this.numeUtilizator = numeUtilizator;
        this.parola = parola;
        this.email = email;
        this.dataNasterii = dataNasterii;
    }


    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
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