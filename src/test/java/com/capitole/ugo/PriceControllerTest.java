package com.capitole.ugo;

import com.capitole.ugo.Price;
import com.capitole.ugo.PriceController;
import com.capitole.ugo.PriceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.time.LocalDateTime;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class PriceControllerTest {

    @Mock
    private PriceService service;

    @InjectMocks
    private PriceController controller;

    private MockMvc mockMvc;

    @BeforeEach  // Initialize mockMvc before each test
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void findPrices_withValidDateAndBrandIdAndProductId_returnsMatchingPrices() throws Exception {
        LocalDateTime date = LocalDateTime.parse("2020-06-14T16:00:00");
        Integer brandId = 1;
        Integer productId = 35455;
        List<Price> expectedPrices = List.of(new Price());
        when(service.findPrices(date, productId, brandId)).thenReturn(expectedPrices);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        mockMvc.perform(get("/api/prices")
                        .param("date", date.toString())
                        .param("productId", productId.toString())
                        .param("brandId", brandId.toString()))
                .andExpect(status().isOk())
                .andExpect(content().json("[{}]"));
    }


    @Test
    public void findPrices_withMissingProductId_returnsBadRequest() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .param("date", "2020-06-14T16:00:00")
                        .param("brandId", "1"))
                .andExpect(status().isBadRequest());
    }

}
