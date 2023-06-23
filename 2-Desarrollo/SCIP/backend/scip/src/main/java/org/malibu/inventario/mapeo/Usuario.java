package org.malibu.inventario.mapeo;


import java.util.List;
import java.util.Scanner;

public class Usuario {

    static Scanner in = new Scanner(System.in);
    private int dni;
    private String nombre;
    Direccion direccion;

    public Usuario() {}
    public Usuario(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Usuario(int dni, String nombre, Direccion direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void createClientes(List<Usuario>p){
        System.out.print("Ingrese DNI :");
        int dni = in.nextInt();
        System.out.print("Ingrese nombre :");
        String nombre = in.next();
        Usuario cli = new Usuario(dni,nombre);
        p.add(cli);
        System.out.println("REGISTRO COMPLETADO");
                                              }
    public void readClientes(List<Usuario> p){
        p.stream().map(s->s.getDni()+"\t"+s.getNombre()).forEach(System.out::println);
                                                }

    public void updateClientes(List<Usuario>p){
        System.out.print("Escoja el cliente a actualizar :");
        int indice = in.nextInt();
        System.out.print("Ingrese nuevo DNI :");
        int dni = in.nextInt();
        System.out.print("Ingrese nuevo NOMBRE :");
        String nombre = in.next();
        Usuario cli = new Usuario(dni,nombre);
        p.set(indice-1,cli);
        System.out.println("ACTUALIZACION COMPLETA");
                                                            }

    public void deleteClientes(List<Usuario>p){
        System.out.print("Escoja el cliente a eliminar :");
        int indice = in.nextInt();
        p.remove(indice-1);
        System.out.println("ELIMINACION COMPLETA");
                                                          }

    public void runCliente(List<Usuario>p){
        int opc;
        System.out.println("===OPCIONES===");
        System.out.println("1)CREAR CLIENTE");
        System.out.println("2)MOSTRAR CLIENTES");
        System.out.println("3)ACTUALIZAR CLIENTE");
        System.out.println("4)ELIMINAR CLIENTE");
        System.out.println("5)SALIR");
        do {
            System.out.print("\nIngrese opcion : ");
            opc = in.nextInt();

            switch(opc){
                case 1: createClientes(p); break;
                case 2: readClientes(p); break;
                case 3: updateClientes(p); break;
                case 4: deleteClientes(p); break;
                case 5:  System.out.println("SALIENDO"); break;
                default: System.out.println("ERROR DE OPCION"); break;
            }

            }while(opc!=5);
    }
}