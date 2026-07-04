package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

    Optional<Marca> findBySlugMarca(String slugMarca);

    List<Marca> findByActivaTrue();
}
