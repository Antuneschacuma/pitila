package com.donas.pitila.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donas.pitila.core.entities.Cliente;

@Repository
public interface ClienteRepository1 extends JpaRepository<Cliente, Long> {
}
