package org.malibu.inventario.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Required;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @Column(length = 8 )
    int numero;

    @Column(length = 50, name = "nombre" )
    @Required
    @Pattern(regexp = "^[a-zA-Z]+([\\s\\-][a-zA-Z]+)*$", message = "El nombre solo debe contener letras y espacios")
    private String nombre;

    @Column(length = 50, name = "apellidos" )
    @Required
    @Pattern(regexp = "^[a-zA-Z]+([\\s\\-][a-zA-Z]+)*$", message = "Los apellidos solo deben contener letras y espacios")
    private String apellidos;

    @Embedded
    Direccion direccion;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @DescriptionsList
    Rol nombreRolDescripcion;

}
