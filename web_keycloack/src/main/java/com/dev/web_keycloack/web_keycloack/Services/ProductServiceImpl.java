package com.dev.web_keycloack.web_keycloack.Services;

import com.dev.web_keycloack.web_keycloack.Entities.Product;
import com.dev.web_keycloack.web_keycloack.Repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    public void addProduct(String name){
        Product newProduct = new Product();
        newProduct.setRef(UUID.randomUUID().toString());
        newProduct.setName(name);
        productRepository.save(newProduct);
    }

    public List<Product> getList(){
        return productRepository.findAll();
    }
}
