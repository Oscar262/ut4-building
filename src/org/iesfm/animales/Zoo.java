package org.iesfm.animales;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {

    private String nombre;
    private Animal[] animales;


    @Override
    public String toString() {
        return "Zoo{" +
                "nombre='" + nombre + '\'' +
                ", animales=" + Arrays.toString(animales) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(nombre, zoo.nombre) && Arrays.equals(animales, zoo.animales);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(animales);
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public Zoo(String nombre, Animal[] animales) {
        this.nombre = nombre;
        this.animales = animales;
    }
}
