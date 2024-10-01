package com.donas.pitila.adapters.controllers;

import org.springframework.stereotype.Service;

import com.donas.pitila.adapters.Dtos.CreateProfissionalRequest;
import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.CadastrarProfissionalPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CriarProfissionalController {

    private final CadastrarProfissionalPort cadastrarProfissionalPort;

    public Profissional criar(CreateProfissionalRequest createProfissionalRequest) {
        return this.cadastrarProfissionalPort.execute(
                createProfissionalRequest.nome(),
                createProfissionalRequest.email(),
                createProfissionalRequest.telefone(),
                createProfissionalRequest.latitude(),
                createProfissionalRequest.longitude());

    }
}
