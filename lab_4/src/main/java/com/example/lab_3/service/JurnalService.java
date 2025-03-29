package com.example.lab_3.service;

import com.example.lab_3.model.IntraJurnal;
import com.example.lab_3.repository.JurnalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JurnalService {

    @Autowired
    private JurnalRepository jurnalRepository;

    public IntraJurnal adaugaJurnal(IntraJurnal jurnal) {
        return jurnalRepository.save(jurnal);
    }

    public List<IntraJurnal> getAllJurnale() {
        return jurnalRepository.findAll();
    }

    public Optional<IntraJurnal> findJurnalById(Long id) {
        return jurnalRepository.findById(id);
    }

    public IntraJurnal actualizeazaJurnal(Long id, IntraJurnal jurnalActualizat) {
        return jurnalRepository.findById(id)
                .map(jurnal -> {
                    if (jurnalActualizat.getButid() != null) {
                        jurnal.setButid(jurnalActualizat.getButid());
                    }
                    if (jurnalActualizat.getData() != null) {
                        jurnal.setData(jurnalActualizat.getData());
                    }
                    if (jurnalActualizat.getOra() != null) {
                        jurnal.setOra(jurnalActualizat.getOra());
                    }
                    if (jurnalActualizat.getContinut() != null) {
                        jurnal.setContinut(jurnalActualizat.getContinut());
                    }
                    return jurnalRepository.save(jurnal);
                })
                .orElse(null);
    }

    public void stergeJurnal(Long id) {
        jurnalRepository.deleteById(id);
    }
}