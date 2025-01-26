package com.dev.web_keycloack.web_keycloack.Controller;

import com.dev.web_keycloack.web_keycloack.Entities.Product;
import com.dev.web_keycloack.web_keycloack.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/products"; // Redirection après l'ajout
    }

    @GetMapping
    public String getList(ModelMap modelMap) {
        var products = productService.getList();
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("product", new Product()); // Prépare un objet vide pour le formulaire
        return "products"; // Vue Thymeleaf
    }
}
