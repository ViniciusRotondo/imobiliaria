package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.DetalheModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DetalheRepository extends JpaRepository<DetalheModel, UUID> {
}
