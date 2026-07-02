package com.example.keyboardbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    /*TODO implementacion de relacion recursiva (padreID) para futuro
    */
    @Column(nullable = false)
    private Boolean activa = true;

    @Column(nullable = false)
    private Integer orden = 0;
}