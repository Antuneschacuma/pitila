package com.donas.pitila.core.ports.out;

import java.util.Optional;

import com.donas.pitila.core.entities.Profissional;

public interface BuscarProfissionalRepositoryPort {

    Optional<Profissional> findById(Long id);
}
