package org.iesfm.Biblioteca;

import java.util.Objects;

public class Socio {

    private String nif;
    private String nombre;
    private String apellidos;
    private int numSocio;
    private int cp;

    public Socio(String nif, String nombre, String apellidos, int numsocio, int cp) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numsocio;
        this.cp = cp;
    }

    public void showInfo() {
        System.out.println(nombre + " " + apellidos + " Es el socio " +
                numSocio + " su codigo postal es " +
                cp + " y su NIf " + nif);
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socios = (Socio) o;
        return numSocio == socios.numSocio && cp == socios.cp && Objects.equals(nif, socios.nif) && Objects.equals(nombre, socios.nombre) && Objects.equals(apellidos, socios.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellidos, numSocio, cp);
    }

    @Override
    public String toString() {
        return "Socios{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numsocio=" + numSocio +
                ", cp=" + cp +
                '}';
    }
}
