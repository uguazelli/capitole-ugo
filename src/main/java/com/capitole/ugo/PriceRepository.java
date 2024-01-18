package com.capitole.ugo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {
    @Query("SELECT p FROM Price p WHERE p.brandId = :brandId AND p.productId = :productId AND p.startDate <= :date AND p.endDate >= :date ORDER BY p.priority DESC")
    List<Price> find(@Param("date") LocalDateTime date, @Param("productId") Integer productId, @Param("brandId") Integer brandId);
}
