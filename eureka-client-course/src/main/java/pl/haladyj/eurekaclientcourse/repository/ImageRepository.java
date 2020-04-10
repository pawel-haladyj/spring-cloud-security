package pl.haladyj.eurekaclientcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.haladyj.eurekaclientcourse.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {

}
