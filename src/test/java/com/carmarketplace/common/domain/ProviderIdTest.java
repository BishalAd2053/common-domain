package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ProviderIdTest {
    @Test
    void wrapsUuid() {
        UUID id = UUID.randomUUID();
        ProviderId pid = new ProviderId(id);
        assertEquals(id, pid.value());
    }

    @Test
    void randomGenerates() {
        ProviderId pid = ProviderId.random();
        assertNotNull(pid.value());
    }
}
