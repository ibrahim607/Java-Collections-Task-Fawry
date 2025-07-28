package org.example;

import java.time.LocalDate;
import java.util.*;

public class PhotoManager {
    List<Photo> photos = new ArrayList<>();
    Map<LocalDate, List<Photo>> photosByDate = new HashMap<>();
    private Map<String, List<Photo>> photosByTag = new HashMap<>();

    public void addPhoto(Photo photo){
        photos.add(photo);
        LocalDate date = photo.getDate();
        photosByDate.computeIfAbsent(date, k -> new ArrayList<>()).add(photo);
        for (String tag : photo.getTags()) {
            photosByTag.computeIfAbsent(tag, k -> new ArrayList<>()).add(photo);
        }
    }
    public void searchByLocation(City city , Photo photo){

        double distance = Utility.haversine(photo.getPhotoLat(),photo.getPhotoLon(),city.getCenterLat(),city.getCenterLon());

        if (distance > city.getRadiusKm()){
            System.out.println("Photo was not taken in " + city.getName());
            return;
        }

        System.out.println("Photo was taken in " + city.getName());

    }

    public List<Photo> searchByDate(LocalDate date) {
        return photosByDate.getOrDefault(date, new ArrayList<>());
    }

    public Set<Photo> searchByTagsAll(List<String> tags) {
        Set<Photo> result = null;
        for (String tag : tags) {
            List<Photo> taggedPhotos = photosByTag.get(tag);
            if (taggedPhotos == null) {
                return Collections.emptySet();
            }
            if (result == null) {
                result = new HashSet<>(taggedPhotos);
            } else {
                result.retainAll(taggedPhotos);
            }
        }
        return result != null ? result : Collections.emptySet();
    }

}
