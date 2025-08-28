package com.carmarketplace.common.domain;

import java.util.Currency;

/**
 * ISO 4217 currency code wrapper.
 */
public record CurrencyCode(String code) {
    public CurrencyCode {
        Guard.notBlank(code, "currency code");
        try {
            Currency.getInstance(code);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("invalid currency code: " + code, ex);
        }
        code = code.toUpperCase();
    }

    @Override
    public String toString() {
        return code;
    }
}
