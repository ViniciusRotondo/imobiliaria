package com.vinicius.imobiliaria.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTE")
public class ClienteModel extends PessoaModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "interesse_id")
    private InteresseModel interesse;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<NegociacaoModel> negociacao = new HashSet<>();


    public ClienteModel() {};

    public ClienteModel(String nomeCompleto, String email, String contato, InteresseModel interesse) {
        super(nomeCompleto, email, contato);
        this.interesse = interesse;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public InteresseModel getInteresse() {
        return interesse;
    }

    public void setInteresse(InteresseModel interesse) {
        this.interesse = interesse;
    }

    public Set<NegociacaoModel> getNegociacao() {
        return negociacao;
    }

    public void setNegociacao(Set<NegociacaoModel> negociacao) {
        this.negociacao = negociacao;
    }
}
