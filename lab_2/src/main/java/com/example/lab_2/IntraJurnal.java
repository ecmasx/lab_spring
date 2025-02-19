package com.example.lab_2;
import lombok.Data;
import java.time.LocalDate;

@Data
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
}
