package br.com.imobiliaria.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_CORRETOR")
public class CorretorModel extends PessoaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String creci;

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "corretor", fetch = FetchType.LAZY)
    private Set<ImovelModel> imoveis = new HashSet<>();

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @OneToMany(mappedBy = "corretor", fetch = FetchType.LAZY)
   private Set<NegociacaoModel> negociacao = new HashSet<>();


    public CorretorModel() {}

    public CorretorModel(String nomeCompleto, String email, String contato, String creci) {
        super(nomeCompleto, email, contato);
        this.creci = creci;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public Set<ImovelModel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(Set<ImovelModel> imoveis) {
        this.imoveis = imoveis;
    }

    public Set<NegociacaoModel> getNegociacao() {
        return negociacao;
    }

    public void setNegociacao(Set<NegociacaoModel> negociacao) {
        this.negociacao = negociacao;
    }
}
