package com.capitole.ugo;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceService {
    private final PriceRepository repository;

    public PriceService(PriceRepository repository) {
        this.repository = repository;
    }

    public List<Price> findPrices(LocalDateTime date, Integer productId, Integer brandId) {
        return repository.find(date, productId, brandId);
    }
}

