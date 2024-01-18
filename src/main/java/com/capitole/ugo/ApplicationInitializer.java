package com.capitole.ugo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class ApplicationInitializer implements CommandLineRunner {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public void run(String... args) throws Exception {
        Price price1 = new Price();
        Price price2 = new Price();
        Price price3 = new Price();
        Price price4 = new Price();

        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        price2.setBrandId(1);
        price2.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        price2.setEndDate( LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        price2.setPriceList(2);
        price2.setProductId(35455);
        price2.setPriority(1);
        price2.setPrice(25.45);
        price2.setCurr("EUR");

        price3.setBrandId(1);
        price3.setStartDate( LocalDateTime.of(2020, 6, 15, 0, 0, 0));
        price3.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 0, 0));
        price3.setPriceList(3);
        price3.setProductId(35455);
        price3.setPriority(1);
        price3.setPrice(30.50);
        price3.setCurr("EUR");

        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");

        // Insertar los valores de la tabla PRICES
        priceRepository.saveAll(Arrays.asList( price1, price2, price3, price4));
    }
}