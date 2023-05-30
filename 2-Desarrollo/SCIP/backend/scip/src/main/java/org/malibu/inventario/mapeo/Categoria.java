package org.malibu.inventario.mapeo;

public class Categoria {

    private String oid;
    private String descripcion;

    public Categoria() { }

    public Categoria(String oid, String descripcion) {
        this.oid = oid;
        this.descripcion = descripcion;             }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
