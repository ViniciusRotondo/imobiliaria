package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.FotoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FotoRepository extends JpaRepository<FotoModel, UUID> {
}
