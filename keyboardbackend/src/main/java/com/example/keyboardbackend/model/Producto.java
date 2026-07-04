package com.example.keyboardbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoID;

    @Column(name = "skuProducto", nullable = false, length = 100, unique = true)
    private String skuProducto;

    @Column(name = "nombreProducto", nullable = false, length = 100, unique = true)
    private String nombreProducto;

    @Column(name = "slugProducto", nullable = false, length = 200, unique = true)
    private String slugProducto;

    @Column(name = "descripcionProducto", columnDefinition = "TEXT")
    private String descripcionProducto;

    @ManyToOne
    @JoinColumn(name = "categoriaID", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "marcaID", nullable = false)
    private Marca marca;

    @Column(name = "precioBase", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioBase;

    @Column(name = "precioOferta", precision = 10, scale = 2)
    private BigDecimal precioOferta;

    @Column(name = "stockTotal", nullable = false)
    private Integer stockTotal = 0;

    @Column(nullable = false)
    private Boolean activo = true;

    @Column(nullable = false)
    private Boolean destacado = false;

    @Column(name = "creadoEn", nullable = false, updatable = false)
    private LocalDateTime creadoEn = LocalDateTime.now();

    @Column(name = "actualizadoEn", nullable = false)
    private LocalDateTime actualizadoEn = LocalDateTime.now();
}