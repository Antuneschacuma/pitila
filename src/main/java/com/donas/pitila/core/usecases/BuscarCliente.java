package com.donas.pitila.core.usecases;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.BuscarClientePort;
import com.donas.pitila.core.ports.out.BuscarClienteRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarCliente implements BuscarClientePort {

    private final BuscarClienteRepositoryPort buscarCliente;

    @Override
    public Optional<Cliente> execute(Long id) {
        return this.buscarCliente.findById(id);

    }

}
