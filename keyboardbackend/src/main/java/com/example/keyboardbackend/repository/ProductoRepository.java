package com.example.keyboardbackend.repository;


import com.example.keyboardbackend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findBySlugProducto(String slugProducto);

    List<Producto> findByActivoTrue();

    List<Producto> findByDestacadoTrue();

    List<Producto> findByCategoria_CategoriaID(Long categoriaId);

    List<Producto> findByMarca_MarcaID(Long marcaId);

    List<Producto> findByNombreProductoContainingIgnoreCase(String texto);

}
