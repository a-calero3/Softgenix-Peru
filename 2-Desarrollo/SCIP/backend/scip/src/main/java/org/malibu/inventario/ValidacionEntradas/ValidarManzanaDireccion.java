package org.malibu.inventario.ValidacionEntradas;

public class ValidarManzanaDireccion {
    public static boolean validarManzana(String manzana) {
        if (manzana.length() != 1) {
            return false; // La manzana debe tener exactamente 1 caracter
        }
        char caracter = manzana.charAt(0);
        return Character.isLetter(caracter);
    }
}
