package com.donas.pitila.applications;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.donas.pitila.adapters.controllers.CriarClienteController;
import com.donas.pitila.applications.Dtos.CreateClientRequest;
import com.donas.pitila.core.entities.Cliente;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/cliente")
public class CriarClienteRota {

    private CriarClienteController clienteController;

    @PostMapping
    public Cliente create(@RequestBody CreateClientRequest createClientRequest) {
        try {
            return this.clienteController.criar(createClientRequest);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("transfer failed: " + e.getMessage());
        }
    }
}