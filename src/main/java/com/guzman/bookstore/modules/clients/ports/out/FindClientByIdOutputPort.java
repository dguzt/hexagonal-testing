package com.guzman.bookstore.modules.clients.ports.out;

import com.guzman.bookstore.modules.clients.entities.Client;

import java.util.Optional;

public interface FindClientByIdOutputPort {
  Optional<Client> findClientById(Long clientId);
}
