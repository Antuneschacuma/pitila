package com.donas.pitila.core.ports.in;

import java.util.Optional;

import com.donas.pitila.core.entities.Cliente;

public interface BuscarClientePort {

    Optional<Cliente> execute(Long id);
}
