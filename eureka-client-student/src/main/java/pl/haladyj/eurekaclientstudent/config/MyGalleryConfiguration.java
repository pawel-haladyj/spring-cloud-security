package pl.haladyj.eurekaclientstudent.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyGalleryConfiguration {

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
