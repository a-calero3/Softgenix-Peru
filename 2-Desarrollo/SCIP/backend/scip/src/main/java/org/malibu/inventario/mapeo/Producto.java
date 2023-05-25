package org.malibu.inventario.mapeo;

import java.math.BigDecimal;

public class Producto {

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
}
