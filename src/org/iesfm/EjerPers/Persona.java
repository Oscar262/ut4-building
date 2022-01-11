package org.iesfm.EjerPers;

import java.util.Objects;

public class Persona {

    private String nombre;
    private String apellido;
    private String nif;
    private int edad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(nif, persona.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nif, edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + nif + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String DNI, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = DNI;
        this.edad = edad;
    }

    public void saluda() {
        System.out.println("Hola soy " + nombre + " " + apellido + " y mi DNI es " + nif);
    }

    public void despedida() {
        System.out.println("Hasta la próxima! Firmado " + nombre);
    }
}
