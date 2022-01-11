package org.iesfm.edificio;

import java.util.Arrays;
import java.util.Objects;

public class Edificio implements IEdificio {

    private String direccion;
    private String municipio;
    private Apartamento[] apartamentos;

    @Override
    public void informacionEdificio() {
        System.out.println("El edificio está en " + direccion + " del municipio " + municipio + " y tiene los apartamentos: ");
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            apartamento.imprimeApartamento();
        }
    }

    @Override
    public void muestraPrimeraPLanta() {
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            if (apartamento.getNumero() == 1) {
                apartamento.imprimeApartamento();
            }
        }
    }

    @Override
    public Apartamento muestraApartamento(int numPlanta, String puerta) {
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            if (apartamento.getNumero() == numPlanta) {
                if (apartamento.getPuerta().equals(puerta)) {
                    return apartamento;
                }
            }
        }
        return null;
    }

    @Override
    public Propietario[] muestraPropietario(int numPlanta, String puerta) {
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            if (apartamento.getNumero() == numPlanta &&
                    apartamento.getPuerta().equals(puerta)) {
                return apartamento.getPropietarios();
            }

        }
        return null;
    }

    public void imprimeEdificio() {
        System.out.println("El edificio está en " + direccion + " del municipio " + municipio + " y tiene los apartamentos: ");
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = apartamentos[i];
            apartamento.imprimeApartamento();
        }
    }

    public Edificio(String direccion, String municipio, Apartamento[] apartamentos) {
        this.direccion = direccion;
        this.municipio = municipio;
        this.apartamentos = apartamentos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(direccion, edificio.direccion) && Objects.equals(municipio, edificio.municipio) && Arrays.equals(apartamentos, edificio.apartamentos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(direccion, municipio);
        result = 31 * result + Arrays.hashCode(apartamentos);
        return result;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", apartamentos=" + Arrays.toString(apartamentos) +
                '}';
    }


}
