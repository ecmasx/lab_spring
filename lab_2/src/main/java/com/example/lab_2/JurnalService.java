package com.example.lab_2;

public class JurnalService {
    private Utilizator utilizator;

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public void afisareJurnal(IntraJurnal intrare) {
        System.out.println("Jurnal pentru utilizator: " + utilizator.getNumeUtilizator());
        System.out.println("Titlu: " + intrare.getTitlu());
        System.out.println("Conținut: " + intrare.getContinut());
    }
}
