package org.iesfm.Biblioteca;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca implements IBiblioteca {

    private String nombre;
    private Libro[] libros;
    private Socio[] socios;
    private Prestamo[] prestamos;

    public Biblioteca(String nombre, Libro[] libros, Socio[] socios, Prestamo[] prestamos) {
        this.nombre = nombre;
        this.libros = libros;
        this.socios = socios;
        this.prestamos = prestamos;
    }

    @Override
    public void muestraLibros() {
        System.out.println("Los libros en la biblioteca son:");
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libros[i];
            libro.showInfo();
        }

    }

    @Override
    public void muestraLibrosGenero(String genero) {
        System.out.println("Los libros del genero " + genero + " son:");
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libros[i];
            if (libro.tieneGenero(genero)) {
                libro.showInfo();
            }
        }
    }

    @Override
    public void datosSocios() {
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socios[i];
            socio.showInfo();
        }
    }

    @Override
    public void datosCP(int cp) {
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socios[i];
            if (socio.getCp() == cp) {
                socio.showInfo();
            }
        }
    }

    @Override
    public void prestamosNIF(String nif) {
        for (int i = 0; i < prestamos.length; i++) {
            Prestamo prestamo = prestamos[i];
            if (prestamo.getNif().equals(nif)) {
                for (int j = 0; j < socios.length; j++) {
                    Socio socio = socios[i];
                    if (socio.getNif().equals(nif)) {
                        System.out.println("El socio");
                        socio.showInfo();
                    }
                }
            }
            System.out.println("Ha realizado los prestamos");
            prestamo.showInfo();
        }
    }

    @Override
    public void prestamosNumSocio(int numSocio) {
        for (int i = 0; i < prestamos.length; i++) {
            Prestamo prestamo = prestamos[i];
            for (int j = 0; j < socios.length; j++) {
                Socio socio = socios[i];
                if (socio.getNumSocio() == numSocio) {
                    if (socio.getNif().equals(prestamo.getNif())) {
                        prestamo.showInfo();
                    }
                }
            }
        }
    }

    @Override
    public boolean prestamoISBN(int isbn, int numSocio) {
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socios[i];
            if (socio.getNumSocio() == numSocio) {
                for (int j = 0; j < prestamos.length; j++) {
                    Prestamo prestamo = prestamos[i];
                    if (prestamo.getIsbn() == isbn) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Libro prestamoSocio(String nif) {
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socios[i];
            if (socio.getNif().equals(nif)) {
                for (int j = 0; i < prestamos.length; j++) {
                    Prestamo prestamo = prestamos[j];
                    for (int k = 0; k < libros.length; k++) {
                        Libro libro = libros[i];
                        if (prestamo.getIsbn() == libro.getIsbn()) {
                            return libro;
                        }
                    }
                }
            }
        }
        return null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Arrays.equals(libros, that.libros) && Arrays.equals(socios, that.socios) && Arrays.equals(prestamos, that.prestamos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(libros);
        result = 31 * result + Arrays.hashCode(socios);
        result = 31 * result + Arrays.hashCode(prestamos);
        return result;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + Arrays.toString(libros) +
                ", socios=" + Arrays.toString(socios) +
                ", prestamos=" + Arrays.toString(prestamos) +
                '}';
    }


}
