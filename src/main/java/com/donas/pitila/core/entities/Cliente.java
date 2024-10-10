package com.donas.pitila.core.entities;

import java.util.List;
import java.time.LocalDate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Embedded
    private Localizacao localizacao;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Agendamento> agendamentos;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacoes;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    public Cliente(String nome, String email, String telefone, Localizacao localizacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.localizacao = localizacao;
        this.dataCriacao = LocalDate.now();
        // validate();
    }

    public void validate() {
        if (this.nome == null || this.nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não está correto");
        }
        if (this.email == null || !this.email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email inválido");
        }
        if (this.telefone == null) {
            throw new IllegalArgumentException("Telefone inválido");
        }
    }
}
