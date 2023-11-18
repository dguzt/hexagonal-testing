package com.guzman.bookstore.modules.clients.adapters.web;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientToRegisterJson {
  @JsonAlias("nombre")
  private String name;
  private String dni;
}
