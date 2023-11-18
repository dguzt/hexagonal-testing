package com.guzman.bookstore.legacy.repositories;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "BOOK")
@Table(name = "BOOK")
public class BookEntity {
  @Id
  private Long id;

  @Column(name = "name", nullable = false, length = 500)
  private String name;
}
