package com.guzman.bookstore.modules.clients.ports.in;

import com.guzman.bookstore.modules.clients.entities.Client;

public interface GetClientByIdInputPort {
  Client execute(Long clientId);
}
