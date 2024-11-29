package org.example.ecommerceelasticsearch.Controller;

import org.example.ecommerceelasticsearch.Entity.Product;
import org.example.ecommerceelasticsearch.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get products by name
    @GetMapping("/search")
    public List<Product> getProductsByName(@RequestParam String name) {
        return productService.getProductsByName(name);
    }

    // Get products filtered by price
    @GetMapping("/filterByPrice")
    public List<Product> getProductsByPrice(@RequestParam double price) {
        return productService.getProductsByPrice(price);
    }

    // Get products sorted by price
    @GetMapping("/sorted")
    public List<Product> getSortedProducts(@RequestParam String keyword) {
        return productService.getSortedProducts(keyword);
    }
}
