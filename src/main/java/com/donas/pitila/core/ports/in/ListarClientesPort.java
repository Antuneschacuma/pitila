package com.donas.pitila.core.ports.in;

import java.util.List;

import com.donas.pitila.core.entities.Cliente;

public interface ListarClientesPort {

    List<Cliente> execute();
}
