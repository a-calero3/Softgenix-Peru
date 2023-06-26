package org.malibu.inventario.ValidacionEntradas;

public class ValidarObservacionesProducto {
    public static boolean validarObservaciones(String observaciones) {
        return observaciones.matches("[a-zA-Z\\s]+");
    }
}
