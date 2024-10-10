package com.donas.pitila.core.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.ListarProfissionaisPort;
import com.donas.pitila.core.ports.out.ListarProfissionaisRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListarProfissionais implements ListarProfissionaisPort {

    private final ListarProfissionaisRepositoryPort listarProfissionais;

    @Override
    public List<Profissional> execute() {
        return this.listarProfissionais.findAll();

    }

}
