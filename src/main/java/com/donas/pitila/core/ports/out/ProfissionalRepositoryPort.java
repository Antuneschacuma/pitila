package com.donas.pitila.core.ports.out;

import com.donas.pitila.core.entities.Profissional;

public interface ProfissionalRepositoryPort {

    Profissional save(Profissional profissional);
}
