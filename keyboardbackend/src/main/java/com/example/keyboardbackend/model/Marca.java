package com.example.keyboardbackend.model;

import jakarta.persistence.*;
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
}