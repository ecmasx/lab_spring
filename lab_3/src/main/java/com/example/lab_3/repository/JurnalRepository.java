package com.example.lab_3.repository;

import com.example.lab_3.model.IntraJurnal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JurnalRepository extends JpaRepository<IntraJurnal, Long> {
}