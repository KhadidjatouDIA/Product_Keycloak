package com.dev.web_keycloack.web_keycloack.Controller;

import com.dev.web_keycloack.web_keycloack.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/products")
@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void addProduct(ModelMap modelMap, @ModelAttribute String name){
        productService.addProduct(name);
    }

    @GetMapping
    public String getList(ModelMap modelMap ){
        var list= productService.getList();
        modelMap.addAttribute("listProducts",list);
        return "products";
    }

}
