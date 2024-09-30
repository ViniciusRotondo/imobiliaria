package br.com.imobiliaria.dtos;

import java.util.UUID;

public record FotosRecordDto(String urlFoto,
                             UUID imovel_id) {
}
