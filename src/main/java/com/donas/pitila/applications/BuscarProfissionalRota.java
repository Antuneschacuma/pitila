package com.donas.pitila.applications;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donas.pitila.adapters.controllers.BuscarProfissionalController;
import com.donas.pitila.core.entities.Profissional;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/profissionais")
public class BuscarProfissionalRota {

    private final BuscarProfissionalController profissionalController;

    @GetMapping("/{id}")
    ResponseEntity<Optional<Profissional>> buscar(@PathVariable Long id) {

        try {
            Optional<Profissional> profissional = profissionalController.buscar(id);
            return ResponseEntity.ok().body(profissional);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());

        }
    }
}
