package com.example.njareb.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private  String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    private Set<Fournisseur> fournisseurs;
    @ManyToOne
    private  Rayon rayon;
    @ManyToOne
    private  Stock stock;
    @OneToOne(mappedBy = "produit")
    private  DetailProduit detailProduit;
    @OneToMany(mappedBy = "produit")
    private Set<DetailProduit> detailProduits;
}
