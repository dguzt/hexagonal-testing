package com.guzman.bookstore.modules.clients.adapters.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientJpaRepository extends JpaRepository<ClientModel, Long> {
  Optional<ClientModel> findFirstById(Long id);
}

