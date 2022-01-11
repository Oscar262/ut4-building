package org.iesfm.Biblioteca;

import java.util.Objects;

public class Prestamo {

    private int isbn;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String nif;

    public Prestamo(int isbn, String fechaPrestamo, String fechaDevolucion, String nif) {
        this.isbn = isbn;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.nif = nif;
    }

    public void showInfo() {
        System.out.println("El libro con ISBN " + isbn + " se prestó el día " +
                fechaPrestamo + " y fue devuelto el " +
                fechaDevolucion + " por el socio con NIF "+nif);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String  getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return fechaPrestamo == prestamo.fechaPrestamo && fechaDevolucion == prestamo.fechaDevolucion && Objects.equals(isbn, prestamo.isbn) && Objects.equals(nif, prestamo.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, fechaPrestamo, fechaDevolucion, nif);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "isbn='" + isbn + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", nif='" + nif + '\'' +
                '}';
    }
}
