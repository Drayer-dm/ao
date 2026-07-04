package com.example.keyboardbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "marca")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marcaID;

    @Column(name = "nombreMarca", nullable = false, length = 100)
    private String nombreMarca;

    @Column(name = "slugMarca", nullable = false, length = 100)
    private String slugMarca;

    @Column(columnDefinition = "TEXT")
    private String descripcionMarca;

    @Column(name = "imagenMarca", columnDefinition = "TEXT")
    private String imagenMarca;

    @Column(nullable = false)
    private Boolean activa = true;

    @Column(nullable = false)
    private Integer orden = 0;

    public Long getMarcaID() {
        return marcaID;
    }

    public void setMarcaID(Long marcaID) {
        this.marcaID = marcaID;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getSlugMarca() {
        return slugMarca;
    }

    public void setSlugMarca(String slugMarca) {
        this.slugMarca = slugMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    public String getImagenMarca() {
        return imagenMarca;
    }

    public void setImagenMarca(String imagenMarca) {
        this.imagenMarca = imagenMarca;
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