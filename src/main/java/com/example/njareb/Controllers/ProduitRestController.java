package com.example.njareb.Controllers;


import com.example.njareb.Entities.Produit;
import com.example.njareb.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Produit")
public class ProduitRestController {
    @Autowired
    IProduitService iProduitService;

    @GetMapping("getAll")
    public List<Produit> retrieveAllProduits(){
       return  iProduitService.retrieveAllProduits();
    }

    @PostMapping("/add")
    public Produit addProduit(@RequestBody Produit p, Long idRayon, Long idStock){
        return iProduitService.addProduit(p, idRayon, idStock);
    }

    @GetMapping("/getOne/{idP}")
    public   Produit retrieveProduit(@PathVariable(value = "idP") Long id){
        return iProduitService.retrieveProduit(id);

    }

}
