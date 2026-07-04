package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.AtributoDefinicion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtributoDefinicionRepository extends JpaRepository<AtributoDefinicion, Long>{

    List<AtributoDefinicion> findByCategoria_CategoriaID(Long categoriaID);
}
