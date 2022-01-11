package org.iesfm.coche;

import java.util.Objects;

public class Vehiculo {


    private String marca;
    private String modelo;
    private int km;
    private String matricula;


    public Vehiculo(String marca, String modelo, String matricula, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.matricula = matricula;
    }

    public void printVehiculo() {
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("Tiene " + km + " km  recorridos");
        System.out.println("La matricula es: " + matricula);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(int km) {
        this.km = km;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return km == vehiculo.km && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo) && Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, km, matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
//    click derecho/alt+insert generate constructor, geters y seters
}
