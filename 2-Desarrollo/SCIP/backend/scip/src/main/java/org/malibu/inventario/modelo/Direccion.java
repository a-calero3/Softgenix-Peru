package org.malibu.inventario.modelo;


import javax.persistence.*;
import javax.validation.constraints.Pattern;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Direccion {

    @Column(length = 30)
    @Pattern(regexp = "^[a-zA-Z]+([\\s\\-][a-zA-Z]+)*$", message = "El nombre solo debe contener letras y espacios")
    String urbanizacion;

    @Column(length = 1)
    String manzana;

    @Column(length = 2)
    int lote;

    @Column(length = 20)
    @Pattern(regexp = "^[a-zA-Z]+([\\s\\-][a-zA-Z]+)*$", message = "El nombre solo debe contener letras y espacios")
    String distrito;

    @Column(length = 30)
    @Pattern(regexp = "^[a-zA-Z]+([\\s\\-][a-zA-Z]+)*$", message = "El nombre solo debe contener letras y espacios")
    String provincia;

    @PrePersist
    @PreUpdate
    private void validarManzana() {
        if (manzana != null && !manzana.matches("[A-Za-z]")) {
            throw new IllegalArgumentException("La manzana debe ser una letra");
        }
    }
}
