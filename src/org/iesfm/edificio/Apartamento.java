package org.iesfm.edificio;

import java.util.Arrays;
import java.util.Objects;

public class Apartamento {

    private int numero;
    private String puerta;
    private Propietario[] propietarios;

    public void imprimeApartamento(){
        System.out.println("En el apartamento "+numero+puerta + " vive:");
        for (int i = 0; i < propietarios.length; i++) {
            Propietario propietario=propietarios[i];
            propietario.imprimePropietario();
        }

    }
    public Apartamento(int numero, String puerta, Propietario[] propietarios) {
        this.numero = numero;
        this.puerta = puerta;
        this.propietarios = propietarios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Propietario[] getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario[] propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return numero == that.numero && Objects.equals(puerta, that.puerta) && Arrays.equals(propietarios, that.propietarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numero, puerta);
        result = 31 * result + Arrays.hashCode(propietarios);
        return result;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numero=" + numero +
                ", puerta='" + puerta + '\'' +
                ", propietarios=" + Arrays.toString(propietarios) +
                '}';
    }
}
