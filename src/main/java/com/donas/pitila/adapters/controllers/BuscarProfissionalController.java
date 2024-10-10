package com.donas.pitila.adapters.controllers;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.BuscarProfissionalPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarProfissionalController {

    private final BuscarProfissionalPort buscarProfissionalPort;

    public Optional<Profissional> buscar(Long id) {
        return this.buscarProfissionalPort.execute(id);
    }
}
