package com.donas.pitila.core.ports.in;

import com.donas.pitila.core.entities.Cliente;

public interface CadastrarClientePort {
    Cliente cadastrar(String nome, String email);
}
