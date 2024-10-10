package com.donas.pitila.core.usecases;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.BuscarProfissionalPort;
import com.donas.pitila.core.ports.out.BuscarProfissionalRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarProfissional implements BuscarProfissionalPort {

    private final BuscarProfissionalRepositoryPort buscarProfissional;

    @Override
    public Optional<Profissional> execute(Long id) {
        return this.buscarProfissional.findById(id);

    }

}
