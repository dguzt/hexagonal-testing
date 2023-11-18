package com.guzman.bookstore.legacy.services;

import com.guzman.bookstore.legacy.models.Book;

import java.util.List;

// contrato de comunicación
public interface GetAllBooksUseCase {
  List<Book> getAllBooks();
}
