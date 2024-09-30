package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.FotoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FotoRepository extends JpaRepository<FotoModel, UUID> {
}
