package com.example.keyboardbackend.service;
//Categoria
import com.example.keyboardbackend.model.Categoria;
import com.example.keyboardbackend.repository.CategoriaRepository;
//Springboot
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//Lombok
import lombok.RequiredArgsConstructor;
//jakarta
import jakarta.persistence.EntityNotFoundException;
//java
import java.util.List;





@Service
@RequiredArgsConstructor
public class CategoriaService {

 private final CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public List<Categoria> listarActivas() {
        return categoriaRepository.findByActivaTrue();
    }

    public Categoria obtenerPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Categoria no encontrada con ID: " + id));
    }

}
