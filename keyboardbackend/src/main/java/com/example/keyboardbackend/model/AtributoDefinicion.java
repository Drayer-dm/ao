package com.example.keyboardbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity 
@Table(name = "atributo_definicion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtributoDefinicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atributoDefinicionID;

    @Column(name = "nombreAtributo", nullable = false, length = 120)
    private String nombreAtributo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDato", nullable = false, length = 50)
    private TipoDato tipoAtributo = TipoDato.TEXTO;

    @Column(nullable = false)
    private Boolean requerido = false;
}
