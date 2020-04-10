package pl.haladyj.eurekaclientcourse.service;

import pl.haladyj.eurekaclientcourse.model.Image;

import java.util.List;

public interface ImageService {
    Image getImageById(Long id);
    List<Image> getAllImages();
}
