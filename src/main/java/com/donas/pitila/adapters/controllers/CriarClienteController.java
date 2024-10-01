package com.donas.pitila.adapters.controllers;

import org.springframework.stereotype.Service;

import com.donas.pitila.adapters.Dtos.CreateClientRequest;
import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.CadastrarClientePort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CriarClienteController {

    private final CadastrarClientePort cadastrarClientePort;

    public Cliente criar(CreateClientRequest createClientRequest) {
        return this.cadastrarClientePort.execute(
                createClientRequest.nome(),
                createClientRequest.email(),
                createClientRequest.telefone(),
                createClientRequest.latitude(),
                createClientRequest.longitude());

    }
}
