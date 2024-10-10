package com.donas.pitila.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.out.BuscarClienteRepositoryPort;

@Repository
public interface BuscarClienteRepository extends JpaRepository<Cliente, Long>, BuscarClienteRepositoryPort {

    // private final JpaRepository<Cliente, Long> clienteJpaRepository;

    // @Override
    // public Optional<Cliente> findById(Long id) {
    // return Optional.ofNullable(
    // clienteJpaRepository.findById(id).orElseThrow(() -> new
    // EntityNotFoundException("Cliente not found")));
    // }
}
