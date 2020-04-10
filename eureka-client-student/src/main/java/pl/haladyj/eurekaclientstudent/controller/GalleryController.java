package pl.haladyj.eurekaclientstudent.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.haladyj.eurekaclientstudent.client.GalleryClient;
import pl.haladyj.eurekaclientstudent.model.Galery;
import pl.haladyj.eurekaclientstudent.model.Image;

import java.util.List;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GalleryController.class);

    @Autowired
    GalleryClient client;

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String home() {
        return "Hello from Gallery Service running at port: " + environment.getProperty("local.server.port");
    }

    @GetMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area of Gallery service running at port: " +
                environment.getProperty("local.server.port");
    }

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "getGaleryFallback")
    public Galery getGalery(@PathVariable("id") final Long id) {
        LOGGER.info("Creating gallery object ... ");
        List<Image> images = client.getAllImages();
        Galery galery = new Galery();
        galery.setId(id);
        galery.setImages(images);
        return galery;

    }

    private Galery getGaleryFallback(Long galleryId, Throwable hystrixCommand) {
        return new Galery(galleryId);
    }

}
