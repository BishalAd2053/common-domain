package com.carmarketplace.common.domain;

import java.util.Objects;

/**
 * Validation helpers for domain primitives.
 */
public final class Guard {
    private Guard() {}

    public static <T> T notNull(T value, String message) {
        return Objects.requireNonNull(value, message);
    }

    public static String notBlank(String value, String message) {
        notNull(value, message);
        if (value.isBlank()) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static double inRange(double value, double minInclusive, double maxInclusive, String message) {
        if (value < minInclusive || value > maxInclusive) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static double nonNegative(double value, String message) {
        if (value < 0) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }
}
