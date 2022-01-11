package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Cliente {

    private String nombreApellidos;
    private String nif;
    private Cuenta[] cuentas;

    public Cliente(String nombreApellidos, String nif, Cuenta[] cuentas) {
        this.nombreApellidos = nombreApellidos;
        this.nif = nif;
        this.cuentas = cuentas;
    }

    public void imprimeCuentasCliente() {
        System.out.println(nombreApellidos + " con NIF " + nif + " le pertenecen las cuentas:");
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas[i];
            cuenta.imprimeCuentas();
        }
    }

    public void imprimeCliente() {
        System.out.println("El nombre y apellidos del cliente son: " + nombreApellidos + " con NIF " + nif);
    }


    public Cuenta getCuentaNumCuneta(int numCuenta) {
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas[i];
            if(cuenta.getNumCuenta()==numCuenta){
                return cuenta;
            }
        }
        return null;

    }


    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente clientes = (Cliente) o;
        return Objects.equals(nombreApellidos, clientes.nombreApellidos) && Objects.equals(nif, clientes.nif) && Arrays.equals(cuentas, clientes.cuentas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombreApellidos, nif);
        result = 31 * result + Arrays.hashCode(cuentas);
        return result;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombreApellidos='" + nombreApellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }


}