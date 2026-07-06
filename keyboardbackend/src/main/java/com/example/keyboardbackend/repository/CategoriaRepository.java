package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Optional<Categoria> findBySlugCategoria(String slugCategoria);

    List<Categoria> findByActivaTrue();
}
