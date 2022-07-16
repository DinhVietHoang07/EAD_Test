package com.ead.ead_tt.repository;

import com.ead.ead_tt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
