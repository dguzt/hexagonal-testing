package com.guzman.bookstore.modules.clients.adapters.persistence.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "client")
@Entity(name = "client")
public class ClientModel {
  @Id
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String name;

  @Column(name = "dni", nullable = false)
  private String dni;
}
