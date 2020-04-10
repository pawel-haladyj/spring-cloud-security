package pl.haladyj.eurekaclientstudent.fallback;

import pl.haladyj.eurekaclientstudent.client.GalleryClient;
import pl.haladyj.eurekaclientstudent.model.Image;

import java.util.Collections;
import java.util.List;

public class GalleryClientFallback implements GalleryClient {

    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public List<Image> getAllImages() {
        return Collections.emptyList();
    }
}
