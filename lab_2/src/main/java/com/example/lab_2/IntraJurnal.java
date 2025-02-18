package com.example.lab_2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
class IntraJurnal {
    private LocalDate data;
    private String titlu;
    private String continut;
    private String stareEmotionala;
    private int nivelEnergie;

    public IntraJurnal(LocalDate data, String titlu, String continut, String stareEmotionala, int nivelEnergie) {
        this.data = data;
        this.titlu = titlu;
        this.continut = continut;
        this.stareEmotionala = stareEmotionala;
        this.nivelEnergie = nivelEnergie;
    }

    public IntraJurnal() {
        this.data = LocalDate.now();
    }


    @Override
    public String toString() {
        return "IntraJurnal{" +
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
        IntraJurnal that = (IntraJurnal) o;
        return nivelEnergie == that.nivelEnergie && Objects.equals(data, that.data) && Objects.equals(titlu, that.titlu) && Objects.equals(continut, that.continut) && Objects.equals(stareEmotionala, that.stareEmotionala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, titlu, continut, stareEmotionala, nivelEnergie);
    }
}
