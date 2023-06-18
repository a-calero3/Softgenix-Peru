package org.malibu.inventario.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Cliente {

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
}
