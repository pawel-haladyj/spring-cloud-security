package pl.haladyj.eurekaclientstudent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Galery {
    private Long id;
    private List<Image> images;

    public Galery(Long id){
        this.id = id;
    }

}
