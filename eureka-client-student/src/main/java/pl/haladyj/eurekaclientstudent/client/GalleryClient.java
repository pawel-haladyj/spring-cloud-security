package pl.haladyj.eurekaclientstudent.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.haladyj.eurekaclientstudent.config.MyGalleryConfiguration;
import pl.haladyj.eurekaclientstudent.fallback.GalleryClientFallback;
import pl.haladyj.eurekaclientstudent.model.Image;

import java.util.List;
@FeignClient(
        value = "imageClient",
        url = "localhost:8200/course",
        configuration = MyGalleryConfiguration.class,
        fallback = GalleryClientFallback.class)
public interface GalleryClient {
    @GetMapping(value = "/image/{id}")
    Image getImageById(@PathVariable("id") Long id);

    @GetMapping(value = "/images")
    List<Image> getAllImages();
}
