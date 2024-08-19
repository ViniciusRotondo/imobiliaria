package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImovelRepository extends JpaRepository<ImovelModel, UUID> {
}
