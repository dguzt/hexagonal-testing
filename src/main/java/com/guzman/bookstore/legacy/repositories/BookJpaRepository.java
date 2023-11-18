package com.guzman.bookstore.legacy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<BookEntity, Long> {
}
