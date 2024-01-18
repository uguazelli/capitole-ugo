package com.capitole.ugo;

import com.capitole.ugo.Price;
import com.capitole.ugo.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PriceServiceTest {

    @Mock
    private PriceRepository repository;

    @InjectMocks
    private PriceService service;

    @Test
    void findPrices_ShouldDelegateToRepositoryAndReturnResult() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0, 0);
        Integer brandId = 1;
        Integer productId = 35455;
        List<Price> expectedPrices = List.of(new Price());

        when(repository.find(date, productId, brandId)).thenReturn(expectedPrices);

        List<Price> prices = service.findPrices(date, productId, brandId);

        assertThat(prices).isEqualTo(expectedPrices);
    }
}
