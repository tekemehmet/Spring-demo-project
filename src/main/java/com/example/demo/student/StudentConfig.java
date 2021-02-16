package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args->{
            Student mehmet = new Student(
                            "Mehmet",
                            "mehmet@yahoo.com",
                            LocalDate.of(1985, JANUARY, 19)

            );

            Student alex = new Student(
                    "Alex",
                    "alex@yahoo.com",
                    LocalDate.of(2000, JANUARY, 19)
            );

            repository.saveAll(
                    List.of(mehmet,alex)
            );

        };
    }
}
