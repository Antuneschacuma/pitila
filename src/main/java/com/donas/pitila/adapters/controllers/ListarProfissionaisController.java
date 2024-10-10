package com.donas.pitila.adapters.controllers;

import java.util.List;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.ListarProfissionaisPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListarProfissionaisController {

    private final ListarProfissionaisPort listarProfissionais;

    public List<Profissional> listar() {
        return this.listarProfissionais.execute();
    }
}
