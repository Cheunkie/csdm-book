package com.example.bookassignment.controller;


import com.example.bookassignment.model.Book;
import com.example.bookassignment.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {


  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService){
    this.bookService = bookService;
  }


  @GetMapping
  public List<Book> getBooks(){
    return bookService.getBooks();
  }
}
