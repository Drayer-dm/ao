package com.example.keyboardbackend.service;

/**
 * Servicio de negocio para gestionar marcas.
 *
 * Encargado de coordinar las operaciones CRUD relacionadas con la entidad Marca,
 * delegando la persistencia en MarcaRepository y aplicando reglas básicas de
 * negocio como la búsqueda por ID, slug y manejo de excepciones cuando no existe
 * una marca solicitada.
 */

//Springboot
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//Lombok
import lombok.RequiredArgsConstructor;
//Model
import com.example.keyboardbackend.model.Marca;
//Repository
import com.example.keyboardbackend.repository.MarcaRepository;
//jakarta
import jakarta.persistence.EntityNotFoundException;
//java
import java.util.List;

@Service
@RequiredArgsConstructor

public class MarcaService {
    private final MarcaRepository marcaRepository;

    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    public List<Marca> listarActivas() {
        return marcaRepository.findByActivaTrue();
    }

    public Marca obtenerPorId(Long id) {
        return marcaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Marca no encontrada con ID: " + id));
    }

    public Marca obtenerPorSlug(String slug) {
        return marcaRepository.findBySlugMarca(slug)
                .orElseThrow(() -> new EntityNotFoundException("Marca no encontrada con slug: " + slug));
    }

    @Transactional
    public Marca crearMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Transactional
    public Marca actualizar(Long id, Marca datosNuevos) {
        Marca marca = obtenerPorId(id);
        marca.setNombreMarca(datosNuevos.getNombreMarca());
        marca.setSlugMarca(datosNuevos.getSlugMarca());
        marca.setDescripcionMarca(datosNuevos.getDescripcionMarca());
        marca.setImagenMarca(datosNuevos.getImagenMarca());
        marca.setActiva(datosNuevos.getActiva());
        marca.setOrden(datosNuevos.getOrden());
        return marcaRepository.save(marca);
    }


    @Transactional
    public void eliminarMarca(Long id) {
        Marca marca = obtenerPorId(id);
        marcaRepository.delete(marca);
    }



}
