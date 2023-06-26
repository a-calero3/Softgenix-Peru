package org.malibu.inventario.ValidacionEntradas;

public class ValidarPrecioProducto {
    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }
}
