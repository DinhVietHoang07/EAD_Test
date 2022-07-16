package com.ead.ead_tt.Service;

import com.ead.ead_tt.repository.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    final SaleRepository saleRepository;
    public SaleService(SaleRepository saleRepository){
        this.saleRepository = saleRepository;
    }
}
