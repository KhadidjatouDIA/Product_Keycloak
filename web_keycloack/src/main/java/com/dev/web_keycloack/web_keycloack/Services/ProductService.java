package com.dev.web_keycloack.web_keycloack.Services;

import com.dev.web_keycloack.web_keycloack.Entities.Product;

import java.util.List;

public interface ProductService {
    void addProduct(String name);
    List<Product> getList();
}
