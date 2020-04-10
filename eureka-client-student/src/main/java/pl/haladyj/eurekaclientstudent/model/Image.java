package pl.haladyj.eurekaclientstudent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
        private Long id;
        private String name;
        private String url;
}
