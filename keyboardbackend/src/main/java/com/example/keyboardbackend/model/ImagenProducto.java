package com.example.keyboardbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "imagen_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImagenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imagenID;

    @ManyToOne
    @JoinColumn(name = "productoID", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "varianteID", nullable = true)
    private VarianteProducto variante;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String url;

    @Column(name ="altText", length = 200)
    private String altText;

    @Column(nullable = false)
    private Integer orden = 0;

    @Column(name = "esPrincipal", nullable = false)
    private Boolean esPrincipal = false;
}
