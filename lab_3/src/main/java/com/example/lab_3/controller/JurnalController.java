package com.example.lab_3.controller;

import com.example.lab_3.model.IntraJurnal;
import com.example.lab_3.service.JurnalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jurnale")
public class JurnalController {

    private final JurnalService jurnalService;

    public JurnalController(JurnalService jurnalService) {
        this.jurnalService = jurnalService;
    }

    @GetMapping
    public ResponseEntity<List<IntraJurnal>> getAllJurnale() {
        return new ResponseEntity<>(jurnalService.findAllJurnale(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IntraJurnal> getJurnalById(@PathVariable Long id) {
        return jurnalService.findJurnalById(id)
                .map(jurnal -> new ResponseEntity<>(jurnal, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<IntraJurnal> adaugaJurnal(@RequestBody IntraJurnal jurnal) {
        return new ResponseEntity<>(jurnalService.adaugaJurnal(jurnal), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizeazaJurnal(@PathVariable Long id, @RequestBody IntraJurnal jurnal) {
        jurnalService.actualizeazaJurnal(id, jurnal);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> stergeJurnal(@PathVariable Long id) {
        jurnalService.stergeJurnal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}