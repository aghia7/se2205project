package com.example.se2205project.services;

import com.example.se2205project.entities.Product;
import com.example.se2205project.repositories.ProductRepository;
import com.example.se2205project.services.interfaces.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getById(int id) {
        var p = productRepository.findById(id);
        if (p.isPresent())
            return p.get();

        return null;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
