package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DomainErrorTest {
    @Test
    void validatesInputs() {
        assertThrows(IllegalArgumentException.class, () -> new DomainError("", "msg"));
        assertThrows(IllegalArgumentException.class, () -> new DomainError("CODE", ""));
    }

    @Test
    void createsError() {
        DomainError error = new DomainError("CODE", "message");
        assertEquals("CODE", error.code());
        assertEquals("message", error.message());
    }
}
