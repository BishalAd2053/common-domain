package com.carmarketplace.common.domain.provider;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    void ratingOutsideRangeThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                new Review(UUID.randomUUID(), UUID.randomUUID(), 6, "bad", OffsetDateTime.now()));
    }
}
