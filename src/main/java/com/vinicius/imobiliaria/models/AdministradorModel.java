package com.vinicius.imobiliaria.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class AdministradorModel extends PessoaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String senha;

    public AdministradorModel() {}

    public AdministradorModel(String nomeCompleto, String email, String contato, String senha) {
        super(nomeCompleto, email, contato);
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
