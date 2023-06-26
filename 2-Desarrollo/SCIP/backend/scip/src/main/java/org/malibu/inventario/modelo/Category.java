package org.malibu.inventario.modelo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.*;
import org.hibernate.validator.constraints.Length;
import org.openxava.annotations.*;

import lombok.*;
@Entity
public class Category {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @Column(length = 50)
    @Length(min = 1, max = 50)
    @NotEmpty
    String descripcion;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
