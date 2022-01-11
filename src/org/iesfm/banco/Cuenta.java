package org.iesfm.banco;

import java.util.Objects;

public class Cuenta {

    private int numCuenta;
    private double saldo;

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public void imprimeCuentas() {
        System.out.println("Con numero de cuenta "+numCuenta + " tiene " + saldo + "€");
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuentas = (Cuenta) o;
        return numCuenta == cuentas.numCuenta && saldo == cuentas.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCuenta, saldo);
    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
