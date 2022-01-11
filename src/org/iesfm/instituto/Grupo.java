package org.iesfm.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Grupo {
    private String aula;
    private Alumno[] alumnos;

    public Grupo(String aula, Alumno[] alumnos) {
        this.aula = aula;
        this.alumnos = alumnos;
    }

    public void imprimeGrupo() {
        System.out.println("En el aula " + aula + " están los alumnos ");
        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno=alumnos[i];
            alumno.imprimeAlumnos();
        }
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(aula, grupo.aula) && Arrays.equals(alumnos, grupo.alumnos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(aula);
        result = 31 * result + Arrays.hashCode(alumnos);
        return result;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "aula='" + aula + '\'' +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }
}
