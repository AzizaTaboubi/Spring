package com.example.njareb.Services;


import com.example.njareb.Entities.Fournisseur;
import com.example.njareb.Entities.Produit;
import com.example.njareb.Entities.Rayon;
import com.example.njareb.Entities.Stock;
import com.example.njareb.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class IProduitServiceIMP implements IProduitService{
   @Autowired
    ProduitRepository produitRepository;
   @Autowired
    StockRepository stockRepository;
   @Autowired
    RayonRepository rayonRepository;
   @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {

        Rayon rayon = rayonRepository.findById(idRayon).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setRayon(rayon);
        p.setStock(stock);


        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        produit.setStock(stock);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit = produitRepository.findById(produitId).orElse(null);
        Set<Fournisseur> fournisseurs = new HashSet<Fournisseur>();
        if (fournisseur != null)
        fournisseurs.add(fournisseur);
        produit.setFournisseurs(fournisseurs);
    }
}
