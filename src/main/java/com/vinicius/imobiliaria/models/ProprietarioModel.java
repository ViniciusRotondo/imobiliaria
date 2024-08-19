package com.vinicius.imobiliaria.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_PROPRIETARIO")
public class ProprietarioModel extends PessoaModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "proprietario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ImovelModel> imoveis = new HashSet<>();

    public ProprietarioModel() {}

    public ProprietarioModel(String nomeCompleto, String email, String contato) {
        super(nomeCompleto, email, contato);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
