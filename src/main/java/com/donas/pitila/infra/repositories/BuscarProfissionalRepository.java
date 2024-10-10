package com.donas.pitila.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.out.BuscarProfissionalRepositoryPort;

@Repository
public interface BuscarProfissionalRepository
        extends JpaRepository<Profissional, Long>, BuscarProfissionalRepositoryPort {
}