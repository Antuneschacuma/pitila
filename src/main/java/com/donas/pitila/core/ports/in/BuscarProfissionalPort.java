package com.donas.pitila.core.ports.in;

import java.util.Optional;

import com.donas.pitila.core.entities.Profissional;

public interface BuscarProfissionalPort {

    Optional<Profissional> execute(Long id);
}
