package com.example.lab_3.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "intra_jurnal")
@Data
public class IntraJurnal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "butid")
    private String butid;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "ora")
    private LocalTime ora;

    @Column(name = "continut", columnDefinition = "TEXT")
    private String continut;

    @ManyToOne
    @JoinColumn(name = "utilizator_id")
    private Utilizator utilizator;

    public IntraJurnal() {
    }

    public IntraJurnal(String butid, LocalDate data, LocalTime ora, String continut) {
        this.butid = butid;
        this.data = data;
        this.ora = ora;
        this.continut = continut;
    }
}