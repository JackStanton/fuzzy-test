package ru.dstu.fuzzytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.dstu.fuzzytest.repository")
@EntityScan("ru.dstu.fuzzytest.entity")
public class FuzzyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuzzyTestApplication.class, args);
    }

}
