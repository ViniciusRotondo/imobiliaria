package com.vinicius.imobiliaria.dtos;

import java.util.UUID;

public record ClienteRecordDto(String nomeCompleto,
                               String email,
                               String contato,
                               UUID interesse_id) {
}
