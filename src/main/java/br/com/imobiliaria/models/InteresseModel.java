package br.com.imobiliaria.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_INTERESSE")
public class InteresseModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private BigDecimal precoMinimo;

    @Column(nullable = false)
    private BigDecimal precoMaximo;

    @Column(nullable = false)
    private String tipoImovel;

    private int qtdDormitorios;

    @ElementCollection
    @CollectionTable(name = "TB_CARACTERISTICAS", joinColumns = @JoinColumn(name = "interesse_id"))
    private List<Long> caracteristicas;

    @OneToOne(mappedBy = "interesse", cascade = CascadeType.ALL)
    private ClienteModel cliente;


    public InteresseModel() {
    }

    public InteresseModel(String cidade, BigDecimal precoMinimo, BigDecimal precoMaximo, String tipoImovel, int qtdDormitorios, List<Long> caracteristicas, ClienteModel cliente) {
        this.cidade = cidade;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.tipoImovel = tipoImovel;
        this.qtdDormitorios = qtdDormitorios;
        this.caracteristicas = caracteristicas;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(BigDecimal precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public BigDecimal getPrecoMaximo() {
        return precoMaximo;
    }

    public void setPrecoMaximo(BigDecimal precoMaximo) {
        this.precoMaximo = precoMaximo;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public List<Long> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Long> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
