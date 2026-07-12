package com.cognizant.practice.rest;
import com.cognizant.practice.rest.entity.Book;
import com.cognizant.practice.rest.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class SpringRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }
    @Bean
    public CommandLineRunner initData(BookRepository repository) {
        return args -> {
            repository.save(new Book("Introduction to Algorithms", "Thomas H. Cormen", 80.0));
            repository.save(new Book("Design Patterns", "Erich Gamma", 55.0));
        };
    }
}
