package com.example.keyboardbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atributo_variante")
@Getter
@Setter
@NoArgsConstructor
public class AtributoVariante {
    
    @EmbeddedId
    private AtributoVarianteId id = new AtributoVarianteId();

    @ManyToOne
    @MapsId("varianteID")
    @JoinColumn(name = "varianteID", nullable = false)
    private VarianteProducto variante;

    @ManyToOne
    @MapsId("atributoID")
    @JoinColumn(name = "atributoID", nullable = false)
    private AtributoDefinicion atributo;


    @Column(nullable = false, columnDefinition = "TEXT")
    private String valor;
}