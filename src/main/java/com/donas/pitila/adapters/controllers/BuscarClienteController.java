package com.donas.pitila.adapters.controllers;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.BuscarClientePort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarClienteController {

    private final BuscarClientePort buscarClientePort;

    public Optional<Cliente> buscar(Long id) {
        return this.buscarClientePort.execute(id);
    }
}
