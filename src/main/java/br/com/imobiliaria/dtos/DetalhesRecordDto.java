package br.com.imobiliaria.dtos;

import java.util.List;
import java.util.UUID;

public record DetalhesRecordDto(int qtdDormitorios,
                                int qtdBanheiros,
                                int vagaGaragem,
                                double areaTotal,
                                double areaTerreno,
                                String infoLazer,
                                List<Long> caracteristicas,
                                UUID imovel_id) {
}
