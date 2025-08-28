package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiusMiTest {
    @Test
    void nonNegative() {
        assertDoesNotThrow(() -> new RadiusMi(5));
        assertThrows(IllegalArgumentException.class, () -> new RadiusMi(-1));
    }
}
