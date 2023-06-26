package org.malibu.inventario.ValidacionEntradas;

public class ValidarStockProducto {
    public static boolean validarStock(int stock) {
        return stock >= 0;
    }

    public static boolean validarCantidadEnteraPositiva(int cantidad) {
        return cantidad > 0;
    }
}
