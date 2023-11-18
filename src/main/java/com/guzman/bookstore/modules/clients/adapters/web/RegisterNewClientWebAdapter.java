package com.guzman.bookstore.modules.clients.adapters.web;

import com.guzman.bookstore.modules.clients.ports.in.ClientToRegister;
import com.guzman.bookstore.modules.clients.ports.in.RegisterNewClientInputPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class RegisterNewClientWebAdapter {

  private final RegisterNewClientInputPort registerNewClientInputPort;

  public RegisterNewClientWebAdapter(RegisterNewClientInputPort registerNewClientInputPort) {
    this.registerNewClientInputPort = registerNewClientInputPort;
  }

  @PostMapping("")
  public void register(@RequestBody ClientToRegisterJson clientToRegisterJson) {
    var clientToRegister = new ClientToRegister(clientToRegisterJson.getName(), clientToRegisterJson.getDni());
    registerNewClientInputPort.execute(clientToRegister);
  }
}
