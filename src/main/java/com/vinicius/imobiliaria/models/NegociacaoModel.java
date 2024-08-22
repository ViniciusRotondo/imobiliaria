package com.vinicius.imobiliaria.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_NEGOCIACAO")
public class NegociacaoModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String observacoes;


    @ManyToOne
    @JoinColumn(name = "corretor_id")
    private CorretorModel corretor;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "imovel_id")
    private ImovelModel imovel;
}
