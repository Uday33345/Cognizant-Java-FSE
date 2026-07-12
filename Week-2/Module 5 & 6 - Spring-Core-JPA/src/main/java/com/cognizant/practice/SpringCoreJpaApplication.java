package com.cognizant.practice;
import com.cognizant.practice.entity.Book;
import com.cognizant.practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
@SpringBootApplication
public class SpringCoreJpaApplication implements CommandLineRunner {
    @Autowired
    private BookService bookService;
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreJpaApplication.class,args);
    }
    @Override
    public void run(String[] args) {
        bookService.saveBook(new Book("Spring in Action","Craig Walls",45.0));
        bookService.saveBook(new Book("Clean Code","Robert C. Martin",50.0));
        List<Book> books=bookService.getAllBooks();
        for(Book b:books) {
            System.out.println("Loaded book:"+b.getTitle()+" by "+b.getAuthor());
        }
    }
}
