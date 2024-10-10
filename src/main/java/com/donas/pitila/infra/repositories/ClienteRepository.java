package com.donas.pitila.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.out.ClienteRepositoryPort;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryPort {

}
