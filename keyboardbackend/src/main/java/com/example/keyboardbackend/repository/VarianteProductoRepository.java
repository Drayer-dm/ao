package com.example.keyboardbackend.repository;

import com.example.keyboardbackend.model.VarianteProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VarianteProductoRepository extends JpaRepository<VarianteProducto, Long> {

    Optional <VarianteProducto> findBySkuVariante(String skuVariante);

    List<VarianteProducto> findByProducto_ProductoID(Long productoID);

    List<VarianteProducto> findByProducto_ProductoIDAndActivaTrue(Long productoID);
    
}
