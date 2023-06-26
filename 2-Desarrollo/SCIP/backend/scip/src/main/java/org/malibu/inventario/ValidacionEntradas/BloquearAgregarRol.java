package org.malibu.inventario.ValidacionEntradas;

public class BloquearAgregarRol {
    private boolean botonBloqueado;
    BloquearAgregarRol bloqueador;
    public BloquearAgregarRol() {
        botonBloqueado = false;
    }

    public void bloquearBoton() {
        botonBloqueado = true;
    }

    public void desbloquearBoton() {
        botonBloqueado = false;
    }

    public boolean isBotonBloqueado() {
        return botonBloqueado;
    }
    public void agregarRol() {

        if (bloqueador.isBotonBloqueado()) {
            System.out.println("El botón ROL está bloqueado. No se pueden agregar más roles.");
        } else {
            // Lógica para agregar un nuevo rol
            System.out.println("Se agregó un nuevo rol correctamente.");
        }
    }

    public void bloquearBotonRol() {
        bloqueador.bloquearBoton();
        System.out.println("El botón ROL ha sido bloqueado.");
    }

    public void desbloquearBotonRol() {
        bloqueador.desbloquearBoton();
        System.out.println("El botón ROL ha sido desbloqueado.");
    }

}
