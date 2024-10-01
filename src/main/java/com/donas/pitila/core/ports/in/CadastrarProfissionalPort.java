package com.donas.pitila.core.ports.in;

import com.donas.pitila.core.entities.Profissional;

public interface CadastrarProfissionalPort {

    Profissional execute(String nome, String email, String telefone, double latitude, double longitude);

}