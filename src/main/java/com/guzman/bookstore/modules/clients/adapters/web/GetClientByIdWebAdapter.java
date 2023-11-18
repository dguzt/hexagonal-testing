package com.guzman.bookstore.modules.clients.adapters.web;

import com.guzman.bookstore.modules.clients.entities.Client;
import com.guzman.bookstore.modules.clients.ports.in.GetClientByIdInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class GetClientByIdWebAdapter {

  private final GetClientByIdInputPort getClientByIdInputPort;

  @GetMapping("/{id}")
  public Client getClientById(@PathVariable Long id) {
    return getClientByIdInputPort.execute(id);
  }
}
