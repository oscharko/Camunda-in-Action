package de.oscharko;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * --------------------
 * Created by oscharko on 27.08.22 - 10:19 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Camunda-in-Action
 * Inside the package - udemy.camunda
 * --------------------
 */
@SpringBootApplication
@EnableProcessApplication
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
