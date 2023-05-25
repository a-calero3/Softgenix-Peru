package org.malibu.inventario.mapeo;

public class Direccion {

   private String viaPublica;
   private int codigoPostal;
   private String distrito;
   private String provincia;

    public Direccion() { }

    public Direccion(String viaPublica, int codigoPostal, String distrito, String provincia) {
        this.viaPublica = viaPublica;
        this.codigoPostal = codigoPostal;
        this.distrito = distrito;
        this.provincia = provincia;
    }

    public String getViaPublica() {
        return viaPublica;
    }

    public void setViaPublica(String viaPublica) {
        this.viaPublica = viaPublica;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
