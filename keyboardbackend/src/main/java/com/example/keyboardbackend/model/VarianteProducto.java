package com.example.keyboardbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "variante_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VarianteProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long varianteID;

    @ManyToOne
    @JoinColumn(name = "productoID", nullable = false)
    private Producto producto;

    @Column(name = "skuVariante", nullable = false, length = 100, unique = true)
    private String skuVariante;

    @Column(name = "nombreVariante", length = 150)
    private String nombreVariante;

    @Column(name = "precioAdicional", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioAdicional = BigDecimal.ZERO;

    @Column(nullable = false)
    private Integer stock = 0;

    @Column(nullable = false)
    private Boolean activa = true;
}