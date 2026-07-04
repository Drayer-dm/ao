package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.ImagenProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ImagenProductoRepository extends JpaRepository<ImagenProducto, Long> {
    List<ImagenProducto> findByProducto_ProductoID(Long productoID);
    List<ImagenProducto> findByVariante_VarianteID(Long varianteID);
}