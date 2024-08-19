package com.vinicius.imobiliaria.repositories;

import com.vinicius.imobiliaria.models.InteresseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InteresseRepository extends JpaRepository<InteresseModel, UUID> {
}
