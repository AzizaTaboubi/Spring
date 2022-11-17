package com.example.njareb.Controllers;


import com.example.njareb.Entities.Client;
import com.example.njareb.Services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRestController {

    @Autowired
    IClientService iClientService;

    @GetMapping("/getAll")
   public List<Client> retrieveAllClients(){
        return iClientService.retrieveAllClients();
    }
    @PostMapping("/add")
    public Client addClient(@RequestBody Client c){
        return iClientService.addClient(c);
    }
    @DeleteMapping("/delete/{idC}")
    public void deleteClient(@PathVariable(value = "idC") Long id){
        iClientService.deleteClient(id);
    }

    @PostMapping("/update")
    public Client updateClient(@RequestBody Client c){
        return iClientService.updateClient(c);
    }

    @GetMapping("getOne/{idC}")
    public Client retrieveClient(@PathVariable(value = "idC") Long id){
        return  iClientService.retrieveClient(id);
    }
}
