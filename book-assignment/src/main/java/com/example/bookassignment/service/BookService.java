package com.example.bookassignment.service;

import com.example.bookassignment.model.Book;
import com.example.bookassignment.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository){
    this.bookRepository = bookRepository;
  }

  public List<Book> getBooks(){
      return bookRepository.findAll();
  }



}
