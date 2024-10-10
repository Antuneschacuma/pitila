package com.donas.pitila.core.ports.in;

import java.util.List;

import com.donas.pitila.core.entities.Profissional;

public interface ListarProfissionaisPort {

    List<Profissional> execute();

}