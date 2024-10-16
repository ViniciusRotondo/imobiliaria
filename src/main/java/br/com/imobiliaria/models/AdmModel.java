package br.com.imobiliaria.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class AdmModel extends PessoaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID id;

    @Column
    private String senha;

    public AdmModel() {}

    public AdmModel(String nomeCompleto, String email, String contato, String senha) {
        super(nomeCompleto, email, contato);
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
