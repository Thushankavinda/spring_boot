package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static java.util.Calendar.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Thushan =new Student(
                    "Thushan",
                    "thushankavinda95@gmail.com",
                    LocalDate.of(1995, SEPTEMBER,06)
            );

            Student Dasitha =new Student(
                    "Dasitha",
                    "dasitha@gmail.com",
                    LocalDate.of(1992, SEPTEMBER,15)
            );
            repository.saveAll(
                    Arrays.asList(Thushan, Dasitha)
            );
        };
    }
}
