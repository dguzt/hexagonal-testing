package com.guzman.bookstore.legacy.controllers;

import com.guzman.bookstore.legacy.models.Book;
import com.guzman.bookstore.legacy.services.GetAllBooksUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

  private final GetAllBooksUseCase getAllBooksService;

  @GetMapping("/random")
  public String randomBookName() {
    return "Maria";
  }

  @GetMapping("")
  public List<Book> allBooks() {
    return getAllBooksService.getAllBooks();
  }
}
