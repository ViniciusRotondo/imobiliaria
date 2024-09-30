package br.com.imobiliaria.dtos;

public record EnderecoRecordDto(String cidade,
                                String bairro,
                                String rua,
                                int numero,
                                String CEP) {
}
