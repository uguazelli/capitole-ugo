package com.capitole.ugo;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class PriceController {
    private final PriceService service;

    public PriceController(PriceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Price> findPrices(@RequestParam("date") String date, @RequestParam("productId") Integer productId, @RequestParam("brandId") Integer brandId) {

        List<Price> result;
        result = service.findPrices(LocalDateTime.parse(date), productId, brandId);
        return result;
    }
}

