package com.guzman.bookstore.modules.clients.usecases;

import com.guzman.bookstore.modules.clients.ports.in.ClientToRegister;
import com.guzman.bookstore.modules.clients.ports.in.RegisterNewClientInputPort;
import com.guzman.bookstore.modules.clients.ports.out.SaveNewClientOutputPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewClientUseCase implements RegisterNewClientInputPort {
  private final SaveNewClientOutputPort saveNewClientOutputPort;

  public RegisterNewClientUseCase(SaveNewClientOutputPort saveNewClientOutputPort) {
    this.saveNewClientOutputPort = saveNewClientOutputPort;
  }

  @Override
  public void execute(ClientToRegister clientToRegister) {
    saveNewClientOutputPort.save(clientToRegister);
  }
}
