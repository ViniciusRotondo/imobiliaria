package br.com.imobiliaria.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_DETALHAMENTO_IMOVEL")
public class DetalheModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private int qtdDormitorios;

    private int qtdBanheiros;

    private int vagaGaragem;

    private double areaTotal;

    private double areaTerreno;

    private String infoLazer;

    private List<Long> caracteristicas;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "imovel_id")
    private ImovelModel imovel;

    public DetalheModel(int qtdDormitorios, int qtdBanheiros, int vagaGaragem, double areaTotal, double areaTerreno, String infoLazer, List<Long> caracteristicas, ImovelModel imovel) {
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.vagaGaragem = vagaGaragem;
        this.areaTotal = areaTotal;
        this.areaTerreno = areaTerreno;
        this.infoLazer = infoLazer;
        this.caracteristicas = caracteristicas;
        this.imovel = imovel;
    }

    public DetalheModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public int getVagaGaragem() {
        return vagaGaragem;
    }

    public void setVagaGaragem(int vagaGaragem) {
        this.vagaGaragem = vagaGaragem;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public String getInfoLazer() {
        return infoLazer;
    }

    public void setInfoLazer(String infoLazer) {
        this.infoLazer = infoLazer;
    }

    public List<Long> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Long> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public ImovelModel getImovel() {
        return imovel;
    }

    public void setImovel(ImovelModel imovel) {
        this.imovel = imovel;
    }
}
