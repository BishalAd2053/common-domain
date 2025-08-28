package com.carmarketplace.common.domain;

/**
 * Search radius in miles.
 */
public record RadiusMi(double value) {
    public RadiusMi {
        Guard.nonNegative(value, "radius must be non-negative");
    }
}
