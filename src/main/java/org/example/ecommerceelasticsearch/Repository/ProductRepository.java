package org.example.ecommerceelasticsearch.Repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.example.ecommerceelasticsearch.model.Product;
import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    // Find products by name
    List<Product> findByName(String name);

    // Find products with price greater than a specific value
    List<Product> findByPriceGreaterThan(double price);

    // Find products with sorting by price
    List<Product> findByNameContaining(String name, Sort sort);
}
