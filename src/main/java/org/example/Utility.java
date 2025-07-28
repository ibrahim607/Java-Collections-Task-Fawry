package org.example;

public class Utility {
    public static double haversine(double photoLat, double photoLon, double cityLat, double cityLon) {
        final int EARTH_RADIUS_KM = 6371;

        double dLat = Math.toRadians(cityLat - photoLat);
        double dLon = Math.toRadians(cityLon - photoLon);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(photoLat)) * Math.cos(Math.toRadians(cityLat))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_KM * c;
    }
}
