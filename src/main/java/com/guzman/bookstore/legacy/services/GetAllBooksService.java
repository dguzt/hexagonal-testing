package com.guzman.bookstore.legacy.services;

import com.guzman.bookstore.legacy.models.Book;
import com.guzman.bookstore.legacy.repositories.BookJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetAllBooksService implements GetAllBooksUseCase {

  private final BookJpaRepository bookJpaRepository;

  public List<Book> getAllBooks() {
    return bookJpaRepository.findAll()
        .stream()
        .map(bookEntity -> new Book(bookEntity.getId(), bookEntity.getName()))
        .collect(Collectors.toList());
  }
}
