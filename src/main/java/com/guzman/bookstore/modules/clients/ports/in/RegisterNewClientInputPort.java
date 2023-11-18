package com.guzman.bookstore.modules.clients.ports.in;

public interface RegisterNewClientInputPort {
  void execute(ClientToRegister clientToRegister);
}
