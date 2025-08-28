package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyCodeTest {
    @Test
    void acceptsValidCode() {
        CurrencyCode usd = new CurrencyCode("usd");
        assertEquals("USD", usd.code());
    }

    @Test
    void rejectsInvalidCode() {
        assertThrows(IllegalArgumentException.class, () -> new CurrencyCode("ZZZ"));
    }
}
