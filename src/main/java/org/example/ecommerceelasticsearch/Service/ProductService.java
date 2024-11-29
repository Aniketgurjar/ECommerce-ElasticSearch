package org.example.ecommerceelasticsearch.Service;

import org.example.ecommerceelasticsearch.Entity.Product;
import org.example.ecommerceelasticsearch.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    // Get products by name
    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    // Get products by price filter
    public List<Product> getProductsByPrice(double price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    // Get products with sorting by price
    public List<Product> getSortedProducts(String keyword) {
        return productRepository.findByNameContaining(keyword, Sort.by(Sort.Direction.ASC, "price"));
    }
}
