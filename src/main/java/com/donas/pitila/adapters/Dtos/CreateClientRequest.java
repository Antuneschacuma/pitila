package com.donas.pitila.adapters.Dtos;

public record CreateClientRequest(String nome, String email, String telefone, double latitude,
        double longitude) {
}