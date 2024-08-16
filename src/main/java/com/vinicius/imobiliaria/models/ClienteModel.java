package com.vinicius.imobiliaria.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
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
}
