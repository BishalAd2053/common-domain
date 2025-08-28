package com.carmarketplace.common.domain;

import java.util.Objects;

/**
 * Base class for strongly typed identifiers.
 */
public abstract class Id<T> {
    private final T value;

    protected Id(T value) {
        this.value = Objects.requireNonNull(value, "id value");
    }

    public T value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id<?> id = (Id<?>) o;
        return value.equals(id.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
