package com.example.njareb.Services;

import com.example.njareb.Entities.CategorieClient;
import com.example.njareb.Entities.Client;

import java.util.Date;
import java.util.List;

public interface IClientService {
   public List<Client> retrieveAllClients();
   public Client addClient(Client c);
   public void deleteClient(Long id);
   public Client updateClient(Client c);
   public Client retrieveClient(Long id);
   public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
}
