package br.com.imobiliaria.repositories;

import br.com.imobiliaria.models.AdmModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdmRepository extends JpaRepository<AdmModel, UUID> {

}
