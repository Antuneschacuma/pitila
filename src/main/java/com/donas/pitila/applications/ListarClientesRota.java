package com.donas.pitila.applications;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donas.pitila.adapters.controllers.ListarClientesController;
import com.donas.pitila.core.entities.Cliente;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/clientes")
public class ListarClientesRota {

    private ListarClientesController listarController;

    @GetMapping
    public List<Cliente> listar() {
        try {
            return this.listarController.listar();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}