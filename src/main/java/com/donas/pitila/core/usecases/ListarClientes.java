package com.donas.pitila.core.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.ListarClientesPort;
import com.donas.pitila.core.ports.out.ListarClientesRepositoryPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ListarClientes implements ListarClientesPort {

    private final ListarClientesRepositoryPort listarClientes;

    @Override
    public List<Cliente> execute() {
        return this.listarClientes.findAll();

    }

}
