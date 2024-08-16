package com.vinicius.imobiliaria.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class PessoaModel {
    private String nomeCompleto;
    private String email;
    private String contato;

    public PessoaModel() {}

    public PessoaModel(String nomeCompleto, String email, String contato) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.contato = contato;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
