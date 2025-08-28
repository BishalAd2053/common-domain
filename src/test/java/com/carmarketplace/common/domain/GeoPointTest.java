package com.carmarketplace.common.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeoPointTest {
    @Test
    void validatesRange() {
        assertThrows(IllegalArgumentException.class, () -> new GeoPoint(100, 0));
        assertThrows(IllegalArgumentException.class, () -> new GeoPoint(0, 190));
    }

    @Test
    void computesDistance() {
        GeoPoint p1 = new GeoPoint(0, 0);
        GeoPoint p2 = new GeoPoint(0, 1);
        double distance = p1.distanceTo(p2);
        assertEquals(69, distance, 1); // approx miles between 1 degree longitude at equator
    }
}
