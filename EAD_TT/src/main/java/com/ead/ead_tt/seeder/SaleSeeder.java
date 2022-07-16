package com.ead.ead_tt.seeder;

import com.ead.ead_tt.entity.Sale;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class SaleSeeder {
    public static List<Sale> sales;
    public static final int NUMBER_OF_SALES = 50;
    public void generate() {
        log.debug("------------Seeding sales-------------");
        Faker faker = new Faker();
        sales = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_SALES; i++) {
            sales.add(Sale.builder()
                    .siNo(Integer.parseInt(UUID.randomUUID().toString()))
                    .salesmanId(Integer.parseInt(faker.cat().name()))
                    .build());
        }
        categoryRepository.saveAll(categories);
        log.debug("===================END OF SEEDING CATEGORY");
    }
}
