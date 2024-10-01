package com.donas.pitila.applications;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donas.pitila.adapters.Dtos.CreateProfissionalRequest;
import com.donas.pitila.adapters.controllers.CriarProfissionalController;
import com.donas.pitila.core.entities.Profissional;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/profissionais")
public class CriarProfissionalRota {

    private CriarProfissionalController profissionalController;

    @PostMapping
    public Profissional create(@RequestBody CreateProfissionalRequest createProfissionalRequest) {
        try {
            return this.profissionalController.criar(createProfissionalRequest);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}