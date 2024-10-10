package com.donas.pitila.core.ports.out;

import java.util.List;

import com.donas.pitila.core.entities.Cliente;

public interface ListarClientesRepositoryPort {

    List<Cliente> findAll();
}
