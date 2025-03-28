package com.example.lab_3.service;

import com.example.lab_3.model.IntraJurnal;
import com.example.lab_3.repository.JurnalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JurnalService {

    private final JurnalRepository jurnalRepository;

    public JurnalService(JurnalRepository jurnalRepository) {
        this.jurnalRepository = jurnalRepository;
    }

    public List<IntraJurnal> findAllJurnale() {
        return jurnalRepository.findAll();
    }

    public Optional<IntraJurnal> findJurnalById(Long id) {
        return jurnalRepository.findById(id);
    }

    public IntraJurnal adaugaJurnal(IntraJurnal jurnal) {
        return jurnalRepository.save(jurnal);
    }

    public void stergeJurnal(Long id) {
        jurnalRepository.deleteById(id);
    }

    public void actualizeazaJurnal(Long id, IntraJurnal jurnalActualizat) {
        Optional<IntraJurnal> jurnalExistent = jurnalRepository.findById(id);
        if (jurnalExistent.isPresent()) {
            jurnalActualizat.setId(id);
            jurnalRepository.save(jurnalActualizat);
        }
    }
}