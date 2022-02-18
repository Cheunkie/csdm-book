package com.example.bookassignment.util;

import com.example.bookassignment.model.Author;
import com.example.bookassignment.model.Book;
import com.example.bookassignment.model.Genre;
import com.example.bookassignment.repository.BookRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class loadDataSets {

  @Bean
  public class loadDataSets {

    CommandLineRunner commandLineRunner(BookRepository bookrepository) {
      return args -> {
        Book lotrs = new Book(100L, "Lord of the Rings", Genre.FICTION,
            List.of(new Author(100L, "J.R.R", "Tolkien", LocalDate.of(1892, Month.JANUARY, 3))));

        Book MyBook = new Book(101L, "Very True Stories", Genre.FICTION,
            List.of(new Author(101L, "Johnny", "Peterson", LocalDate.of(1956, Month.APRIL, 23))));

        bookrepository.saveAll(List.of(lotrs, MyBook));
      };
    }
  }
}
