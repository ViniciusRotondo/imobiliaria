package br.com.imobiliaria.dtos;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record InteresseRecordDto(String cidade,
                                 BigDecimal precoMinimo,
                                 BigDecimal precoMaximo,
                                 String tipoImovel,
                                 int qtdDormitorios,
                                 List<Long> caracteristicas) {
}
