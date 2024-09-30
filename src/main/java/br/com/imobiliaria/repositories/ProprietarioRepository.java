package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.ProprietarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProprietarioRepository extends JpaRepository<ProprietarioModel, UUID> {
}
