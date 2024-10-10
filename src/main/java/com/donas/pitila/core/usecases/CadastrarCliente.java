package com.donas.pitila.core.usecases;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

//import java.time.LocalDate;

import com.donas.pitila.core.entities.Cliente;
import com.donas.pitila.core.entities.Localizacao;
import com.donas.pitila.core.ports.in.CadastrarClientePort;
import com.donas.pitila.core.ports.out.ClienteRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CadastrarCliente implements CadastrarClientePort {

    private final ClienteRepositoryPort clienteRepository;

    @Override
    public Cliente execute(String nome, String email, String telefone, double latitude, double longitude) {
        Localizacao localizacao = new Localizacao(latitude, longitude);

        Cliente cliente = Cliente.builder()
                .nome(nome)
                .email(email)
                .telefone(telefone)
                .localizacao(localizacao)
                .dataCriacao(LocalDate.now())
                .build();
        cliente.validate();
        return clienteRepository.save(cliente);
    }
}
