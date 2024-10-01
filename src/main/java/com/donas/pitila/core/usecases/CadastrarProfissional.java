package com.donas.pitila.core.usecases;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.donas.pitila.core.entities.Localizacao;
import com.donas.pitila.core.entities.Profissional;
import com.donas.pitila.core.ports.in.CadastrarProfissionalPort;
import com.donas.pitila.core.ports.out.ProfissionalRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CadastrarProfissional implements CadastrarProfissionalPort {

    private final ProfissionalRepositoryPort profissionalRepository;

    @Override
    public Profissional execute(String nome, String email, String telefone, double latitude, double longitude) {
        Localizacao localizacao = new Localizacao(latitude, longitude);

        Profissional proficional = Profissional.builder()
                .nome(nome)
                .email(email)
                .telefone(telefone)
                .localizacao(localizacao)
                .dataCriacao(LocalDate.now())
                .build();

        return profissionalRepository.save(proficional);
    }

}
