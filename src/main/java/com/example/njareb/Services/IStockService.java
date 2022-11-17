package com.example.njareb.Services;

import com.example.njareb.Entities.Stock;

import java.util.List;

public interface IStockService {

  public  List<Stock> retrieveAllStocks();

  public  Stock addStock(Stock s);

  public  Stock updateStock(Stock u);

  public  Stock retrieveStock(Long id);
}
