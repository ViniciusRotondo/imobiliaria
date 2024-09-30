package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.DetalheModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DetalheRepository extends JpaRepository<DetalheModel, UUID> {
}
