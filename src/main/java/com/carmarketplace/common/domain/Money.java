package com.carmarketplace.common.domain;

import java.math.BigDecimal;

/**
 * Monetary amount with currency.
 */
public record Money(BigDecimal amount, CurrencyCode currency) {
    public Money {
        Guard.notNull(amount, "amount");
        Guard.notNull(currency, "currency");
    }

    public Money plus(Money other) {
        ensureSameCurrency(other);
        return new Money(this.amount.add(other.amount), currency);
    }

    public Money minus(Money other) {
        ensureSameCurrency(other);
        return new Money(this.amount.subtract(other.amount), currency);
    }

    private void ensureSameCurrency(Money other) {
        Guard.notNull(other, "other");
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("currency mismatch");
        }
    }
}
