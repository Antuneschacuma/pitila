package com.donas.pitila.adapters.Dtos;

public record CreateProfissionalRequest(String nome, String email, String telefone, double latitude,
        double longitude) {
}