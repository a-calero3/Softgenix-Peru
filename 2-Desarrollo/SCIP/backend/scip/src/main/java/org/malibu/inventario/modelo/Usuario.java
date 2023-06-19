package org.malibu.inventario.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @Column(length = 8 )
    int numero;

    @Column(length = 50, name = "nombre" )
    @Required
    String nombres;

    @Column(length = 50, name = "apellidos" )
    @Required
    String apellidos;

    @Embedded
    Direccion direccion;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    Rol nombreRolDescripcion;

}
