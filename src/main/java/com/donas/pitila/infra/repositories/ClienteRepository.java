package com.donas.pitila.infra.repositories;

import org.springframework.stereotype.Repository;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.out.ClienteRepositoryPort;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ClienteRepository implements ClienteRepositoryPort {

    private final ClienteRepository1 clienteRepository1;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository1.save(cliente);
    }
}
