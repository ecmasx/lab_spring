package com.example.lab_3.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "jurnale")
@Data
@NoArgsConstructor
public class IntraJurnal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String titlu;
    private String continut;
    private String stareEmotionala;
    private int nivelEnergie;

    @ManyToOne
    @JoinColumn(name = "utilizator_id")
    private Utilizator utilizator;

    public IntraJurnal(LocalDate data, String titlu, String continut, String stareEmotionala, int nivelEnergie, Utilizator utilizator) {
        this.data = data;
        this.titlu = titlu;
        this.continut = continut;
        this.stareEmotionala = stareEmotionala;
        this.nivelEnergie = nivelEnergie;
        this.utilizator = utilizator;
    }
}