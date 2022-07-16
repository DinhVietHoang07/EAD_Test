package com.ead.ead_tt.Service;

import com.ead.ead_tt.entity.Product;
import com.ead.ead_tt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }
    public Product save(Product products){
        return productRepository.save(products);
    }
    public void deleteById(String id){
        productRepository.deleteById(id);
    }
}
