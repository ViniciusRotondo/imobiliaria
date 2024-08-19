package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {
}
