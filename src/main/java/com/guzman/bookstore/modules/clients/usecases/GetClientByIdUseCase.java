package com.guzman.bookstore.modules.clients.usecases;

import com.guzman.bookstore.modules.clients.entities.Client;
import com.guzman.bookstore.modules.clients.ports.in.GetClientByIdInputPort;
import com.guzman.bookstore.modules.clients.ports.out.FindClientByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetClientByIdUseCase implements GetClientByIdInputPort {
  private final FindClientByIdOutputPort findClientByIdOutputPort;

  @Override
  public Client execute(Long clientId) {
    var optClient = findClientByIdOutputPort.findClientById(clientId);

    if (optClient.isEmpty()) {
      var errorMessage = String.format("client with id '%d' not found", clientId);
      throw new RuntimeException(errorMessage);
    }

    return optClient.get();
  }
}
