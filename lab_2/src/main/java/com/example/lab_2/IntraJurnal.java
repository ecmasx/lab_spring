package com.example.lab_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class IntraJurnal {
    private LocalDate data;
    private String titlu;
    private String continut;
    private String stareEmotionala;
    private int nivelEnergie;
    private Utilizator utilizator;

    @Autowired
    private IntraJurnal(@Qualifier("utilizatorBean") Utilizator utilizator) {
        this.utilizator = utilizator;
    }
}