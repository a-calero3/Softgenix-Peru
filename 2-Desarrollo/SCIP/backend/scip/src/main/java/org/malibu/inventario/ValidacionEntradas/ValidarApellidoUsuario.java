package org.malibu.inventario.ValidacionEntradas;

public class ValidarApellidoUsuario {

    public static boolean validarApellido(String apellido) {
        return apellido.matches("[a-zA-Z]+");
    }


}
