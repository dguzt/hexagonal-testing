package com.guzman.bookstore.modules.clients.ports.out;

import com.guzman.bookstore.modules.clients.ports.in.ClientToRegister;

public interface SaveNewClientOutputPort {
  void save(ClientToRegister clientToRegister);
}
