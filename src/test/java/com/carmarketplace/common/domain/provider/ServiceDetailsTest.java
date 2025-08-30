package com.carmarketplace.common.domain.provider;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ServiceDetailsTest {

    @Test
    void negativePriceThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                new ServiceDetails(UUID.randomUUID(), ServiceCategory.MAINTENANCE, "t", "d", PriceType.FIXED, BigDecimal.valueOf(-1), List.of()));
    }
}
