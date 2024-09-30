package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.InteresseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InteresseRepository extends JpaRepository<InteresseModel, UUID> {
}
