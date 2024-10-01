package com.donas.pitila.core.ports.in;

import com.donas.pitila.core.entities.Cliente;

public interface CadastrarClientePort {
    Cliente execute(String nome, String email, String telefone, double latitude, double longitude);
}
