package com.donas.pitila.adapters.controllers;

import java.util.List;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.ListarClientesPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ListarClientesController {

    private final ListarClientesPort listarClientesPort;

    public List<Cliente> listar() {
        return this.listarClientesPort.execute();
    }
}
