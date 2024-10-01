package com.donas.pitila.infra.repositories;

import org.springframework.stereotype.Repository;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.out.ProfissionalRepositoryPort;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ProfissionalRepository implements ProfissionalRepositoryPort {

    private final ProfissionalRepository1 profissionalRepository1;

    @Override
    public Profissional save(Profissional profissional) {
        return profissionalRepository1.save(profissional);
    }

}
