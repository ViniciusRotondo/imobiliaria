package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.ProprietarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProprietarioRepository extends JpaRepository<ProprietarioModel, UUID> {
}
