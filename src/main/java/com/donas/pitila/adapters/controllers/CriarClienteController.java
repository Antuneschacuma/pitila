package com.donas.pitila.adapters.controllers;

import org.springframework.stereotype.Service;

import com.donas.pitila.applications.Dtos.CreateClientRequest;
import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.CadastrarClientePort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CriarClienteController {

    private final CadastrarClientePort cadastrarClientePort;

    public Cliente criar(CreateClientRequest createClientRequest) {
        return this.cadastrarClientePort.cadastrar(createClientRequest.nome(), createClientRequest.email());

    }
}
