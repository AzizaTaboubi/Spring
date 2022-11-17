package com.example.njareb.Repositories;

import com.example.njareb.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    public List<Facture> getFactureByClient_IdClient(Long idClient);
}
