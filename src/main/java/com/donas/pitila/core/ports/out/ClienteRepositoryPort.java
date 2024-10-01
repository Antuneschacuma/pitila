package com.donas.pitila.core.ports.out;

import com.donas.pitila.core.entities.Cliente;

public interface ClienteRepositoryPort {

    Cliente save(Cliente cliente);
}
