package com.vinicius.imobiliaria.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_IMOVEL")
public class ImovelModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String titulo;

    @Embedded
    private EnderecoModel endereco;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private boolean paraVenda;

    @Column(nullable = false)
    private boolean paraLocacao;

   @ManyToOne
    @JoinColumn(name = "proprietario_id", nullable = false)
    private ProprietarioModel proprietario;

   @ManyToOne
    @JoinColumn(name = "corretor_id" , nullable = false)
    private CorretorModel corretor;

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @OneToOne(mappedBy = "imovel", cascade = CascadeType.ALL)
   private DetalheModel detalhamento;

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @OneToMany(mappedBy = "imovel", fetch = FetchType.LAZY)
   private Set<FotoModel> fotos = new HashSet<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "imovel", fetch = FetchType.LAZY)
    private Set<NegociacaoModel> negociacao = new HashSet<>();

    public ImovelModel() {}

    public ImovelModel(String titulo, EnderecoModel endereco, double valor, boolean paraVenda,
                       boolean paraLocacao, ProprietarioModel proprietario, CorretorModel corretor,
                       DetalheModel detalhamento, Set<FotoModel> fotos)
    {
        this.titulo = titulo;
        this.endereco = endereco;
        this.valor = valor;
        this.paraVenda = paraVenda;
        this.paraLocacao = paraLocacao;
        this.proprietario = proprietario;
        this.corretor = corretor;
        this.detalhamento = detalhamento;
        this.fotos = fotos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isParaVenda() {
        return paraVenda;
    }

    public void setParaVenda(boolean paraVenda) {
        this.paraVenda = paraVenda;
    }

    public boolean isParaLocacao() {
        return paraLocacao;
    }

    public void setParaLocacao(boolean paraLocacao) {
        this.paraLocacao = paraLocacao;
    }

    public ProprietarioModel getProprietario() {
        return proprietario;
    }

    public void setProprietario(ProprietarioModel proprietario) {
        this.proprietario = proprietario;
    }

    public CorretorModel getCorretor() {
        return corretor;
    }

    public void setCorretor(CorretorModel corretor) {
        this.corretor = corretor;
    }

    public DetalheModel getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(DetalheModel detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Set<FotoModel> getFotos() {
        return fotos;
    }

    public void setFotos(Set<FotoModel> fotos) {
        this.fotos = fotos;
    }

    public Set<NegociacaoModel> getNegociacao() {
        return negociacao;
    }

    public void setNegociacao(Set<NegociacaoModel> negociacao) {
        this.negociacao = negociacao;
    }
}

