package org.malibu.inventario.mapeo;


import java.util.List;
import java.util.Scanner;

public class Cliente {

    static Scanner in = new Scanner(System.in);
    private int dni;
    private String nombre;

    public Cliente() {}
    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
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

    public void createClientes(List<Cliente>p){
        System.out.print("Ingrese DNI :");
        int dni = in.nextInt();
        System.out.print("Ingrese nombre :");
        String nombre = in.next();
        Cliente cli = new Cliente(dni,nombre);
        p.add(cli);
        System.out.println("REGISTRO COMPLETADO");
                                              }
    public void readClientes(List<Cliente> p){
        p.stream().map(s->s.getDni()+"\t"+s.getNombre()).forEach(System.out::println);
                                                }

    public void updateClientes(List<Cliente>p){
        System.out.print("Escoja el cliente a actualizar :");
        int indice = in.nextInt();
        System.out.print("Ingrese nuevo DNI :");
        int dni = in.nextInt();
        System.out.print("Ingrese nuevo NOMBRE :");
        String nombre = in.next();
        Cliente cli = new Cliente(dni,nombre);
        p.set(indice-1,cli);
        System.out.println("ACTUALIZACION COMPLETA");
                                                            }

    public void deleteClientes(List<Cliente>p){
        System.out.print("Escoja el cliente a eliminar :");
        int indice = in.nextInt();
        p.remove(indice-1);
        System.out.println("ELIMINACION COMPLETA");
                                                          }

    public void runCliente(List<Cliente>p){
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