package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.AdmModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdmRepository extends JpaRepository<AdmModel, UUID> {
}
