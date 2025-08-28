package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlStringTest {
    @Test
    void acceptsValid() {
        UrlString url = new UrlString("https://example.com");
        assertEquals("https://example.com", url.value());
    }

    @Test
    void rejectsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new UrlString("htp://bad"));
    }
}
