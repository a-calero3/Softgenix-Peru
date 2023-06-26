package org.malibu.inventario.modelo;


import javax.persistence.*;
import javax.validation.constraints.Pattern;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Direccion {

    @Column(length = 30)
    String urbanizacion;

    @Column(length = 1)
    String manzana;

    @Column(length = 2)
    int lote;

    @Column(length = 20)
    String distrito;

    @Column(length = 30)
    String provincia;

    @PrePersist
    @PreUpdate
    private void validarManzana() {
        if (manzana != null && !manzana.matches("[A-Za-z]")) {
            throw new IllegalArgumentException("La manzana debe ser una letra");
        }
    }
}
