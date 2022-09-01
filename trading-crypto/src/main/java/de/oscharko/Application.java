package de.oscharko;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * IntelliJ IDEA 2022.2
 * --------------------
 * ITGAIN Consulting Gesellschaft für IT-Beratung mbH
 * Check out -> www.itgain-consulting.de
 * --------------------
 * Created by oliver.scharkowski on 27.08.22 - 22:31 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Camunda-in-Action
 * Inside the package - de.oscharko
 * --------------------
 */
@SpringBootApplication
@EnableProcessApplication
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
