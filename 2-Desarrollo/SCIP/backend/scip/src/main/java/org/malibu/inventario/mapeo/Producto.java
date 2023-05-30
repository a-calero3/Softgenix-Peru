package org.malibu.inventario.mapeo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Producto {
    static Scanner in = new Scanner(System.in);
    private int numero;
    private String descripcion;
    private BigDecimal precio;
    private String fotos;
    private String observaciones;
    private Categoria categoria;

    public Producto() {  }

    public Producto(int numero, String descripcion, BigDecimal precio, String fotos, String observaciones) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotos = fotos;
        this.observaciones = observaciones;                                                                 }

    public Producto(int numero, String descripcion, BigDecimal precio, String fotos, String observaciones, Categoria categoria) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotos = fotos;
        this.observaciones = observaciones;
        this.categoria = categoria;
    }

    public Producto(int numero, String descripcion, BigDecimal precio, String observaciones, Categoria categoria) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.observaciones = observaciones;
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void createProducto(List<Producto> p){
        System.out.print("Ingrese codProducto :");
        int cod = in.nextInt();
        System.out.print("Ingrese nombre Producto :");
        String descripcion = in.next();
        System.out.print("Ingrese precio del producto :");
        BigDecimal precio = in.nextBigDecimal();
        System.out.print("Observaciones del producto :");
        String obser = in.next();
        System.out.print("Ingrese su cod categoria :");
        String oid = in.next();
        System.out.print("Nombre categoria :");
        String desc = in.next();
        Categoria cat1 = new Categoria(oid,desc);
        Producto producto = new Producto(cod,descripcion,precio,obser,oid,cat1);
        p.add(producto);
        System.out.println("REGISTRO COMPLETADO");
                                                    }

    public void readProductos(List<Producto> p){
        p.stream().map(s->s.getNumero()+"\t"+s.getDescripcion()+"\t"+s.getPrecio()+"\t"+s.getCategoria().getOid()+"\t"+s.getCategoria().getDescripcion()+"\t"+s.getObservaciones()).forEach(System.out::println);
                                                }

    public void updateProducto(List<Producto>p){
        System.out.print("Elija el producto a actualizar :");
        int indice = in.nextInt();
        System.out.print("Ingrese nuevo codigo de producto :");
        int cod = in.nextInt();
        System.out.print("Ingrese nuevo nombre producto :");
        String nombPro = in.next();
        System.out.print("Ingrese nuevo precio del producto :");
        BigDecimal precioNuevo = in.nextBigDecimal();
        System.out.print("Nuevas Observaciones del producto :");
        String obser = in.next();
        System.out.print("Ingrese su nueva categoria :");
        String oid = in.next();
        System.out.print("Nombre categoria nueva:");
        String desc = in.next();
        Categoria cat1 = new Categoria(oid,desc);
        Producto producto = new Producto(cod,descripcion,precio,obser,oid,cat1);
        p.set(indice,producto);
        System.out.println("MODIFICACION COMPLETADADA");
                                             }

    public void deleteProducto(List<Producto>p){
        System.out.print("Escoja el producto a eliminar :");
        int indice = in.nextInt();
        p.remove(indice-1);
        System.out.println("ELIMINACION COMPLETA");
                                                }

    public void runTestProductos(List<Producto>p){
        int opc;
        System.out.println("===GESTIONAR PRODUCTOS===");
        System.out.println("1)CREAR PRODUCTO");
        System.out.println("2)MOSTRAR PRODUCTOS");
        System.out.println("3)ACTUALIZAR PRODUCTO");
        System.out.println("4)ELIMINAR PRODUCTO");
        System.out.println("5)SALIR");
        do {
            System.out.print("\nIngrese opcion : ");
            opc = in.nextInt();

            switch(opc){
                case 1: createProducto(p); break;
                case 2: readProductos(p); break;
                case 3: updateProducto(p); break;
                case 4: deleteProducto(p); break;
                case 5:  System.out.println("SALIENDO"); break;
                default: System.out.println("ERROR DE OPCION"); break;
            }

        }while(opc!=5);
    }

    public void insertaProductos(List<Producto> p) {
        Map<Integer, Producto> productos = new HashMap<>();
        productos.put(1001, new Producto(1001, "Zapatilla CAT", BigDecimal.valueOf(560), "Zapatilla Cuero argentino", new Categoria("A123", "CALZADO")));
        productos.put(1002, new Producto(1002, "Casaca Montalban", BigDecimal.valueOf(1090), "Casaca cuero peruano", new Categoria("B201", "CASACA")));
        productos.put(1003, new Producto(1003, "Zapato BATA", BigDecimal.valueOf(400), "Zapato de vestir cuero negro", new Categoria("A124", "CALZADO")));
        productos.put(1004, new Producto(1004, "Billetera GUESS", BigDecimal.valueOf(139), "Billetera color marron con bordado", new Categoria("C301", "BILLETERA")));
        productos.put(1005, new Producto(1005, "Zapatillas BATA dx12", BigDecimal.valueOf(439), "Zapatillas marrones cuero argentino", new Categoria("A125", "CALZADO")));
        productos.put(1006, new Producto(1006, "Mochila Nike 3kg", BigDecimal.valueOf(780), "Mochila con capacidad 3kilos marron", new Categoria("D004", "MOCHILA")));
        productos.put(1007, new Producto(1007, "Billetera Tarjetero", BigDecimal.valueOf(189), "Billetera basica con monedero y tarjetero", new Categoria("C302", "BILLETERA")));
        productos.put(1008, new Producto(1008, "Sandalias Talla 42", BigDecimal.valueOf(209), "Sandalias de cuero marron", new Categoria("A126", "CALZADO")));
        p.addAll(productos.values());
                                               }

    public void buscarProducto(int cod, List<Producto>p) {
        insertaProductos(p);
        boolean band = false;

        for(int i=0 ; i<p.size() ; i++){
            if( cod == p.get(i).getNumero() ){ band = true;  }
        }

        if(band == true) {
            System.out.println("SE ENCONTRO EL PRODUCTO");
        }else{
            System.out.println("NO SE ENCONTRO EL PRODUCTO");
            }

    }


                    }

