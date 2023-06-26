package org.malibu.inventario.ValidacionEntradas;

public class ValidarCategoriaNoVacia {
    private String descripcion;

    public ValidarCategoriaNoVacia(String descripcion) {
        if (validarDescripcion(descripcion)) {
            this.descripcion = descripcion;
        } else {
            throw new IllegalArgumentException("Descripción no válida");
        }
    }

    private boolean validarDescripcion(String descripcion) {
        return descripcion != null && !descripcion.isEmpty() && descripcion.length() >= 1 && descripcion.length() <= 50;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
