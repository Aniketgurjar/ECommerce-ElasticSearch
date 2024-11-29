package org.example.ecommerceelasticsearch.Repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.example.ecommerceelasticsearch.model.Product;
import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

  
    List<Product> findByName(String name);

   
    List<Product> findByPriceGreaterThan(double price);

   
    List<Product> findByNameContaining(String name, Sort sort);
}
