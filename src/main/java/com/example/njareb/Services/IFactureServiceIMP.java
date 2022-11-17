package com.example.njareb.Services;

import com.example.njareb.Entities.Facture;
import com.example.njareb.Repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IFactureServiceIMP implements  IFactureService{


  @Autowired
    FactureRepository factureRepository;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
      Facture facture = factureRepository.findById(id).orElse(null);
      if (facture != null || facture.isActive()==false){
        factureRepository.delete(facture);
      }


    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }
}
