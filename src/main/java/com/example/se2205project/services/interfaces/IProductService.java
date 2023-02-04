package com.example.se2205project.services.interfaces;

import com.example.se2205project.entities.Product;

import java.util.List;

public interface IProductService {
    Product getById(int id);
    Product create(Product product);
    List<Product> getAll();
}
