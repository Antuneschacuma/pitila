package com.donas.pitila.core.ports.out;

import java.util.Optional;

import com.donas.pitila.core.entities.Cliente;

public interface BuscarClienteRepositoryPort {

    Optional<Cliente> findById(Long id);
}
