package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImovelRepository extends JpaRepository<ImovelModel, UUID> {
}
