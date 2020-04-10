package pl.haladyj.eurekaclientcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCourseApplication.class, args);
	}

}
