package com.donas.pitila.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donas.pitila.core.entities.Profissional;

@Repository
public interface ProfissionalRepository1 extends JpaRepository<Profissional, Long> {
}
