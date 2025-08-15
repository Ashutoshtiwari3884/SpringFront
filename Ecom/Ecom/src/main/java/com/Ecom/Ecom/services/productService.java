package com.Ecom.Ecom.services;

import com.Ecom.Ecom.model.Product;
import com.Ecom.Ecom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class productService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
    return repo.findAll();
    }
}
