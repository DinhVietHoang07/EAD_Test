package com.ead.ead_tt.seeder;

import com.ead.ead_tt.entity.Product;
import com.ead.ead_tt.entity.enums.ProductStatus;
import com.ead.ead_tt.entity.util.NumberUtil;
import com.ead.ead_tt.repository.ProductRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component
@Slf4j
public class ProductSeeder {
    public static List<Product> products;
    public static final int NUMBER_OF_PRODUCT = 100;

    @Autowired
    ProductRepository productRepository;
    public void generate() {
        log.debug("------------Seeding product-------------");
        Faker faker = new Faker();
        products = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PRODUCT; i++) {
            products.add(Product.builder()
                    .prodId(Integer.parseInt(UUID.randomUUID().toString()))
                    .prodName(faker.name().name())
                    .description(faker.lorem().sentence())
                    .status(ProductStatus.ACTIVE)
                    .build());
        }
        productRepository.saveAll(products);
        log.debug("--------------End of seeding product-------------");
    }
    }
}
