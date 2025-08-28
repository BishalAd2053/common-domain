package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    @Test
    void acceptsValid() {
        PhoneNumber pn = new PhoneNumber("+14155552671");
        assertEquals("+14155552671", pn.value());
    }

    @Test
    void rejectsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new PhoneNumber("12345"));
    }
}
