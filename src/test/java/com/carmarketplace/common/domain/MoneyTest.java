package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    private static final CurrencyCode USD = new CurrencyCode("USD");

    @Test
    void plusAddsAmounts() {
        Money m1 = new Money(BigDecimal.TEN, USD);
        Money m2 = new Money(BigDecimal.ONE, USD);
        Money sum = m1.plus(m2);
        assertEquals(new BigDecimal("11"), sum.amount());
    }

    @Test
    void currencyMismatchThrows() {
        Money usd = new Money(BigDecimal.ONE, USD);
        Money eur = new Money(BigDecimal.ONE, new CurrencyCode("EUR"));
        assertThrows(IllegalArgumentException.class, () -> usd.plus(eur));
    }
}
