package com.dev.web_keycloack.web_keycloack.Controller;

import com.dev.web_keycloack.web_keycloack.Entities.Product;
import com.dev.web_keycloack.web_keycloack.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/products")
@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public String addProduct(@RequestParam String name) {
        productService.addProduct(name);
        return "redirect:/products"; // Redirige après ajout
    }

    @GetMapping
    public String getList(ModelMap modelMap) {
        var list = productService.getList();
        modelMap.addAttribute("products", list);
        modelMap.addAttribute("product", new Product()); // Initialisation
        return "products";
    }
}


