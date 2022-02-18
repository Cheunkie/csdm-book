package com.example.bookassignment.service;

import com.example.bookassignment.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthorService {
  private final AuthorRepository repository;

}
