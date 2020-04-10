package pl.haladyj.eurekaclientcourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.haladyj.eurekaclientcourse.model.Image;
import pl.haladyj.eurekaclientcourse.service.implemetation.ImageServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/course")
public class ImageController {

    private final ImageServiceImpl service;

    public ImageController(ImageServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/image/{id}")
    public Image getImageById(@PathVariable("id") Long id){
        return service.getImageById(id);
    }

    @GetMapping("/images")
    public List<Image> getAllImages(){
        return service.getAllImages();
    }
}
