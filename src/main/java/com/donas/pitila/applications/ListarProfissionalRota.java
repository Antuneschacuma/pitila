package com.donas.pitila.applications;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donas.pitila.adapters.controllers.ListarProfissionaisController;
import com.donas.pitila.core.entities.Profissional;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/profissionais")
public class ListarProfissionalRota {

    private final ListarProfissionaisController listarProfissionais;

    @GetMapping
    public ResponseEntity<List<Profissional>> listar() {
        try {
            List<Profissional> profissionais = listarProfissionais.listar();
            return ResponseEntity.ok(profissionais);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
