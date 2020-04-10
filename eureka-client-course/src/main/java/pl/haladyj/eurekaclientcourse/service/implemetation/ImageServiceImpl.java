package pl.haladyj.eurekaclientcourse.service.implemetation;

import org.springframework.stereotype.Service;
import pl.haladyj.eurekaclientcourse.model.Image;
import pl.haladyj.eurekaclientcourse.repository.ImageRepository;
import pl.haladyj.eurekaclientcourse.service.ImageService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    public ImageServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public Image getImageById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Image> getAllImages() {
        return repository.findAll();
    }
}
