package fr.ustephan.tripmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class TripManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripManagerApplication.class, args);
    }

}
