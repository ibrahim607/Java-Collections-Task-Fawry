package org.example;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhotoManager photoManager = new PhotoManager();

        Photo photo1 = new Photo("photo1", new String[]{"nature", "sunset"}, 30.0444, 31.2357, LocalDate.of(2023, 7, 20));
        Photo photo2 = new Photo("photo2", new String[]{"urban", "night"}, 29.9600, 30.9200, LocalDate.of(2023, 7, 19));
        Photo photo3 = new Photo("photo3", new String[]{"nature", "landscape"}, 30.1000, 31.2000, LocalDate.of(2023, 7, 20));
        Photo photo4 = new Photo("photo4", new String[]{"animals"}, 28.0000, 30.0000, LocalDate.of(2023, 7, 18));

        photoManager.addPhoto(photo1);
        photoManager.addPhoto(photo2);
        photoManager.addPhoto(photo3);
        photoManager.addPhoto(photo4);

        System.out.println("Date check:");
        LocalDate foundDate = LocalDate.of(2023, 7, 20);
        List<Photo> foundDatePhotos = photoManager.searchByDate(foundDate);
        if (foundDatePhotos.isEmpty()) {
            System.out.println("No photos found on " + foundDate);
        } else {
            for (Photo photo : foundDatePhotos) {
                System.out.println(photo.getPhotoName());
            }
        }

        System.out.println();

        LocalDate missingDate = LocalDate.of(2023, 1, 1);
        System.out.println("Date check:");
        List<Photo> missingDatePhotos = photoManager.searchByDate(missingDate);
        if (missingDatePhotos.isEmpty()) {
            System.out.println("No photos found on " + missingDate);
        } else {
            for (Photo photo : missingDatePhotos) {
                System.out.println(photo.getPhotoName());
            }
        }

        System.out.println();

        System.out.println("Tag check:");
        List<String> tagSet1 = Arrays.asList("nature");
        Set<Photo> tagPhotos1 = photoManager.searchByTagsAll(tagSet1);
        if (tagPhotos1.isEmpty()) {
            System.out.println("No photos found with tags: " + tagSet1);
        } else {
            for (Photo photo : tagPhotos1) {
                System.out.println(photo.getPhotoName());
            }
        }

        System.out.println();

        System.out.println("Tag check:");
        List<String> tagSet2 = Arrays.asList("nature", "sunset");
        Set<Photo> tagPhotos2 = photoManager.searchByTagsAll(tagSet2);
        if (tagPhotos2.isEmpty()) {
            System.out.println("No photos found with tags: " + tagSet2);
        } else {
            for (Photo photo : tagPhotos2) {
                System.out.println(photo.getPhotoName());
            }
        }

        System.out.println();

        System.out.println("Tag check:");
        List<String> tagSet3 = Arrays.asList("vacation", "beach");
        Set<Photo> tagPhotos3 = photoManager.searchByTagsAll(tagSet3);
        if (tagPhotos3.isEmpty()) {
            System.out.println("No photos found with tags: " + tagSet3);
        } else {
            for (Photo photo : tagPhotos3) {
                System.out.println(photo.getPhotoName());
            }
        }

        System.out.println();

        City cairo = new City("Cairo", 30.0444, 31.2357, 5.0);

        System.out.println("Location check:");
        photoManager.searchByLocation(cairo, photo1);

        System.out.println("Location check:");
        photoManager.searchByLocation(cairo, photo2);

    }
}