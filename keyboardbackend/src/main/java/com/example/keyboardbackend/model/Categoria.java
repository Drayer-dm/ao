package com.example.keyboardbackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaID;

    @Column(name = "nombreCategoria", nullable = false, length = 100)
    private String nombreCategoria;

    @Column(name = "slugCategoria", nullable = false, length = 100)
    private String slugCategoria;

    @Column(columnDefinition = "TEXT")
    private String descripcionCategoria;

    @Column(name = "imagenCategoria", columnDefinition = "TEXT")
    private String imagenCategoria;

    //TODO implementacion de relacion recursiva (padreID) para futuro
    @Column(nullable = false)
    private Boolean activa;

    @Column(nullable = false)
    private Integer orden = 0;

    //Constructor
    public Categoria() {
    }

    //Getters and Setters
    public Long getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(Long categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getSlugCategoria() {
        return slugCategoria;
    }

    public void setSlugCategoria(String slugCategoria) {
        this.slugCategoria = slugCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public String getImagenCategoria() {
        return imagenCategoria;
    }

    public void setImagenCategoria(String imagenCategoria) {
        this.imagenCategoria = imagenCategoria;
    }

    public Boolean getActiva() {
        return activa;
    }
    
    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}