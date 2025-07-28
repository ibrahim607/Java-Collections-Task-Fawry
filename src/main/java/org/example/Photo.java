package org.example;

import java.time.LocalDate;

public class Photo {
    private String photoName;
    private String[] tags;
    private double photoLon;
    private double photoLat;
    private LocalDate date;

    public Photo(String photoName, String[] tags, double photoLon, double photoLat, LocalDate date) {
        this.photoName = photoName;
        this.tags = tags;
        this.photoLon = photoLon;
        this.photoLat = photoLat;
        this.date = date;
    }

    public String getPhotoName() {
        return photoName;
    }

    public String[] getTags() {
        return tags;
    }

    public double getPhotoLon() {
        return photoLon;
    }

    public double getPhotoLat() {
        return photoLat;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setPhotoLon(double photoLon) {
        this.photoLon = photoLon;
    }

    public void setPhotoLat(double photoLat) {
        this.photoLat = photoLat;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
