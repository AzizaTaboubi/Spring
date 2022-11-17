package com.example.njareb.Controllers;


import com.example.njareb.Entities.Facture;
import com.example.njareb.Services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureRestController {

    @Autowired
    IFactureService iFactureService;

    @GetMapping("/getAll")
    public List<Facture> retrieveAllFactures(){
       return iFactureService.retrieveAllFactures();
    }

    @DeleteMapping("/delete/{idF}")
    public void cancelFacture(@PathVariable(value = "idF") Long id){
        iFactureService.cancelFacture(id);
    }

    @GetMapping("/getOne/{idF}")
    public  Facture retrieveFacture(@PathVariable(value = "idF") Long id){
        return iFactureService.retrieveFacture(id);
    }
}
