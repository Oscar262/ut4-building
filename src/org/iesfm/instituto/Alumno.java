package org.iesfm.instituto;

import java.util.Objects;

public class Alumno {
    private String nombreAlumno;
    private String apellidos;
    private int codigoPostal;

    public Alumno(String nombreAlumno, String apellidos, int codigoPostal) {
        this.nombreAlumno = nombreAlumno;
        this.apellidos = apellidos;
        this.codigoPostal = codigoPostal;
    }

    public void imprimeAlumnos() {
        System.out.println(nombreAlumno + " " + apellidos + " con codigo postal " + codigoPostal);
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return codigoPostal == alumno.codigoPostal && Objects.equals(nombreAlumno, alumno.nombreAlumno) && Objects.equals(apellidos, alumno.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAlumno, apellidos, codigoPostal);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
