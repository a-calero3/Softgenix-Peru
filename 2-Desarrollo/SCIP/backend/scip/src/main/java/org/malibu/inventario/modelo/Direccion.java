package org.malibu.inventario.modelo;


import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {

    @Column(length=30)
    String urbanizacion;

    @Column(length=1)
    String manzana;

    @Column(length=2)
    int lote;

    @Column(length=20)
    String distrito;

    @Column(length=30)
    String provincia;

}