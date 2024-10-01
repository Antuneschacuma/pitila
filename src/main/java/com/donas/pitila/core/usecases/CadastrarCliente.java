package com.donas.pitila.core.usecases;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.ports.in.CadastrarClientePort;
import com.donas.pitila.core.ports.out.ClienteRepositoryPort;

@Service
public class CadastrarCliente implements CadastrarClientePort {

    private final ClienteRepositoryPort clienteRepository;

    public CadastrarCliente(ClienteRepositoryPort clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente cadastrar(String nome, String email) {

        Cliente cliente = Cliente.builder()
                .nome(nome)
                .email(email)
                .build();

        return clienteRepository.save(cliente);
    }
}
