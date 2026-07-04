package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.AtributoVariante;
import com.example.keyboardbackend.model.AtributoVarianteId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AtributoVarianteRepository extends JpaRepository<AtributoVariante,AtributoVarianteId> {

    List<AtributoVariante> FindByVariante_VarianteID(Long varianteID);
}
