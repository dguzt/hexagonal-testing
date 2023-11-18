package com.guzman.bookstore.modules.clients.adapters.persistence.jpa;

import com.guzman.bookstore.modules.clients.entities.Client;
import com.guzman.bookstore.modules.clients.ports.in.ClientToRegister;
import com.guzman.bookstore.modules.clients.ports.out.FindClientByIdOutputPort;
import com.guzman.bookstore.modules.clients.ports.out.SaveNewClientOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClientManagementPersistenceJpaAdapter implements
    SaveNewClientOutputPort,
    FindClientByIdOutputPort {

  private final ClientJpaRepository clientJpaRepository;

  @Override
  public void save(ClientToRegister clientToRegister) {
    var row = new ClientModel();
    row.setName(clientToRegister.name());
    row.setDni(clientToRegister.dni());

    clientJpaRepository.save(row);
  }

  @Override
  public Optional<Client> findClientById(Long clientId) {
    return clientJpaRepository.findFirstById(clientId)
        .map(r -> new Client(r.getId(), r.getName(), r.getDni()));
  }
}
