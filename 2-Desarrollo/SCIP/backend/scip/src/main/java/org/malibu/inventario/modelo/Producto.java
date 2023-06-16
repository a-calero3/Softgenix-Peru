package org.malibu.inventario.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Entity
@Getter
@Setter
public class Producto {

    @Id
    @Column(length = 9,name = "codigo") // Cambia el nombre del atributo
    int codigo; // Cambia el nombre del atributo

    @Column(length = 50)
    @Required
    String descripcion;

    @Column(length = 9)
    int stock;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    Category nombreCategoriaDescripcion;

    @Money
    BigDecimal precio;

    @Files
    @Column(length = 32)
    String fotos;

    @TextArea
    String observaciones;

}
