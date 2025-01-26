package com.dev.web_keycloack.web_keycloack.Services;

import com.dev.web_keycloack.web_keycloack.Entities.Product;
import com.dev.web_keycloack.web_keycloack.Repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getList() {
        return productRepository.findAll();
    }
}
