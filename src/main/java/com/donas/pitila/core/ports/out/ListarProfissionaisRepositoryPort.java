package com.donas.pitila.core.ports.out;

import java.util.List;

import com.donas.pitila.core.entities.Profissional;

public interface ListarProfissionaisRepositoryPort {

    List<Profissional> findAll();
}
