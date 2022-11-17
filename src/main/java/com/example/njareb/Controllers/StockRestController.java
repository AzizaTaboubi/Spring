package com.example.njareb.Controllers;


import com.example.njareb.Entities.Stock;
import com.example.njareb.Services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockRestController {

    @Autowired
    IStockService iStockService;

    @GetMapping("/getALL")
    public List<Stock> retrieveAllStocks(){
        return  iStockService.retrieveAllStocks();
    }
    @PostMapping("/add")
    public  Stock addStock(@RequestBody Stock s){
     return   iStockService.addStock(s);
    }

    @PostMapping("/update")
    public  Stock updateStock(@RequestBody Stock u){
        return iStockService.updateStock(u);
    }

    @GetMapping("/getOne/{idS}")
    public  Stock retrieveStock(@PathVariable(value = "idS") Long id){
        return iStockService.retrieveStock(id);

    }
}
