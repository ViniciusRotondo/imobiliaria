package br.com.imobiliaria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoModel {

    @Column(nullable = false)
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;

    public EnderecoModel() {}


    public EnderecoModel(String cidade, String bairro, String rua, String numero, String cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public EnderecoModel(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
