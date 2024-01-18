package com.capitole.ugo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
INSERT INTO PRICE (ID, BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR) VALUES
(1, 1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR'),
(2, 1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR'),
(3, 1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR'),
(4, 1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');


curl "http://localhost:8080/api/prices?date=2020-06-14T10:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-14T16:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-14T21:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-15T10:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-16T21:00:00&productId=35455&brandId=1"

*/