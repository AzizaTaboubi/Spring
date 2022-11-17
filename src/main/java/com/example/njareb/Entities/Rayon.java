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
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idRayon;
    private String codeRayon;
    private String libelleRayon;
    @OneToMany(mappedBy = "rayon")
    private Set<Produit> produits;

}
