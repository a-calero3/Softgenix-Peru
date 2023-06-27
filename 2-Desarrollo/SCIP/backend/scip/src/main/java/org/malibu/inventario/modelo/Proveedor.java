package org.malibu.inventario.modelo;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;
@Entity
@Getter
@Setter
public class Proveedor {

    @Id
    @Column(length = 9,name = "codigo") // Cambia el nombre del atributo
    int codigo; // Cambia el nombre del atributo

    @Column(length = 50)
    @NotEmpty
    String descripcion;

}

