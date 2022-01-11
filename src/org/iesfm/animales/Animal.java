package org.iesfm.animales;

import java.util.Objects;

public class Animal {

    private String especie;
    private int edad;
    private int jaula;
    private String alimentacion;

    public Animal(String especie, int edad, int jaula, String alimentacion) {
        this.especie = especie;
        this.edad = edad;
        this.jaula = jaula;
        this.alimentacion = alimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animales = (Animal) o;
        return edad == animales.edad && jaula == animales.jaula && Objects.equals(especie, animales.especie) && Objects.equals(alimentacion, animales.alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, edad, jaula, alimentacion);
    }

    @Override
    public String toString() {
        return "Animales{" +
                "especie='" + especie + '\'' +
                ", edad=" + edad +
                ", jaula=" + jaula +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }

    public void imprimeAnimal() {
        System.out.println("El animal de la especie " + especie + " de la jaula " + jaula + " con  " + edad + " de edad es " + alimentacion);
    }
}
