package com.carmarketplace.common.domain;

/**
 * Immutable latitude/longitude point with basic validation and distance calculation.
 */
public record GeoPoint(double latitude, double longitude) {
    private static final double EARTH_RADIUS_MI = 3958.8; // miles

    public GeoPoint {
        Guard.inRange(latitude, -90.0, 90.0, "latitude must be between -90 and 90");
        Guard.inRange(longitude, -180.0, 180.0, "longitude must be between -180 and 180");
    }

    /** Calculates distance to another point using the haversine formula. */
    public double distanceTo(GeoPoint other) {
        Guard.notNull(other, "other");
        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(other.latitude);
        double lon2 = Math.toRadians(other.longitude);
        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS_MI * c;
    }
}
