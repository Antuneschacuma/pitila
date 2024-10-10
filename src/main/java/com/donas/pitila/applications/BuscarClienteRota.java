package com.donas.pitila.applications;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donas.pitila.adapters.controllers.BuscarClienteController;
import com.donas.pitila.core.entities.Cliente;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/clientes")
public class BuscarClienteRota {

    private final BuscarClienteController clienteController;

    @GetMapping("/{id}")
    ResponseEntity<Optional<Cliente>> buscar(@PathVariable Long id) {

        try {
            Optional<Cliente> cliente = clienteController.buscar(id);
            return ResponseEntity.ok().body(cliente);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());

        }
    }
}
