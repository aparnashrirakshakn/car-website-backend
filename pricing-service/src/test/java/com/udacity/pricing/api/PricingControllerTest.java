package com.udacity.pricing.api;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PricingControllerTest {
    private MockMvc mockMvc;

    public PricingControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void findPrice() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/services/price?vehicleId=1")
                .accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(
                status().isOk()
        );
    }
}
