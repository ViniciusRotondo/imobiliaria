package br.com.imobiliaria.dtos;

import java.util.Set;
import java.util.UUID;

public record ImovelRecordDto(String titulo,
                              EnderecoRecordDto endereco,
                              double valor,
                              boolean paraVenda,
                              boolean paraLocacao,
                              UUID proprietarioId,
                              UUID corretorId,
                              UUID detalhamentoId,
                              Set<UUID> fotosId) {
}
