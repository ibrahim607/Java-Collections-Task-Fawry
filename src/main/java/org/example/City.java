package org.example;

public class City {
    private String name;
    private double centerLon;
    private double centerLat;
    private double radiusKm;

    public City(String name, double centerLon, double centerLat, double radiusKm) {
        this.name = name;
        this.centerLon = centerLon;
        this.centerLat = centerLat;
        this.radiusKm = radiusKm;
    }

    public String getName() {
        return name;
    }

    public double getCenterLon() {
        return centerLon;
    }

    public double getCenterLat() {
        return centerLat;
    }

    public double getRadiusKm() {
        return radiusKm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCenterLon(double centerLon) {
        this.centerLon = centerLon;
    }

    public void setCenterLat(double centerLat) {
        this.centerLat = centerLat;
    }

    public void setRadiusKm(double radiusKm) {
        this.radiusKm = radiusKm;
    }
}
