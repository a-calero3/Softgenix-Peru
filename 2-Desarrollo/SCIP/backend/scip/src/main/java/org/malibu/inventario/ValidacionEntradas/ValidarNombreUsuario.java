package org.malibu.inventario.ValidacionEntradas;

public class ValidarNombreUsuario {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }

}
