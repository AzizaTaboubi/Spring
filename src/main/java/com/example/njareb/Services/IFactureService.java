package com.example.njareb.Services;

import com.example.njareb.Entities.Facture;

import java.util.List;

public interface IFactureService {

  public  List<Facture> retrieveAllFactures();
   public void cancelFacture(Long id);
  public  Facture retrieveFacture(Long id);
}
