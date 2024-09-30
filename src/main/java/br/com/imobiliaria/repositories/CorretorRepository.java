package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.CorretorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CorretorRepository extends JpaRepository<CorretorModel, UUID> {
}
