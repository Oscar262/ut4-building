package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Banco implements IBanco {

    private String nombre;
    private Cliente[] lista;

    public Banco(String nombre, Cliente[] lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    @Override
    public void muestraListaClientes() {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = lista[i];
            cliente.imprimeCliente();
        }

    }

    @Override
    public void muestraCuentas(String nif) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = lista[i];
            if (cliente.getNif().equals(nif)) {
                cliente.imprimeCuentasCliente();
            } else {
                System.out.println("No está registrado el cliente con nif " + nif);
            }
        }
    }

    @Override
    public void muestraCuenta(String nif, int numCuenta) {
        Cliente cliente = getCliente(nif);
        if (cliente == null) {
            System.out.println("Error, no existe el cliente");
        } else {
            Cuenta cuenta = cliente.getCuentaNumCuneta(numCuenta);
            if (cuenta == null) {
                System.out.println("Error la cuenta no existr");
            }
        }

    }

    public Cuenta getCuentaCliente(String nif, int numCuenta) {
        Cliente cliente = getCliente(nif);
        if (cliente == null) {
            System.out.println("Error, no existe el cliente");
        } else {
            Cuenta cuenta = cliente.getCuentaNumCuneta(numCuenta);
            if (cuenta == null) {
                System.out.println("Error la cuenta no existr");
            }
            return cuenta;
        }
        return null;

    }

    public Cliente getCliente(String nif) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = lista[i];
            if (cliente.getNif().equals(nif)) {
                return cliente;
            }
        }
        return null;

    }

    @Override
    public Cliente ingreso(String nif, int numCuenta, double ingreso) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente=lista[i];
            for (int j = 0; j < cliente.getCuentas().length; j++) {
                Cuenta cuenta=cliente.getCuentas()[i];
                cuenta.setSaldo(cuenta.getSaldo()+ingreso);
            }
        }
        return null;
    }

    public Cliente sacarDinero(String nif, int numCuenta, double dineroSacado) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente=lista[i];
            for (int j = 0; j < cliente.getCuentas().length; j++) {
                Cuenta cuenta=cliente.getCuentas()[i];
                cuenta.setSaldo(cuenta.getSaldo()-dineroSacado);
            }
        }
        return null;
    }

    @Override
    public Cliente traspaso(String nif, int numCuentaOrigen, int numCuentaDestino, double traspaso) {
        Cuenta cuentaOrigen = getCuentaCliente(nif, numCuentaOrigen);
        Cuenta cuentaDestino = getCuentaCliente(nif, numCuentaDestino);
        if (cuentaOrigen == null || cuentaDestino == null) {
            System.out.println("Una de las cuentas no existe");
        } else {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - traspaso);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + traspaso);
        }
        return null;
    }

    @Override
    public Cliente traspaso2Clientes(String nif1, String nif2, int numCuentaOrigen, int numCuentaDestino, double traspaso) {
        Cuenta cuentaOrigen = getCuentaCliente(nif1, numCuentaOrigen);
        Cuenta cuentaDestino = getCuentaCliente(nif2, numCuentaDestino);
        if (cuentaOrigen == null || cuentaDestino == null) {
            System.out.println("Una de las cuentas no existe");
        } else {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - traspaso);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + traspaso);
        }
        return null;
    }

    @Override
    public Cuenta traspaso2Cuentas(int numCuentaOrigen, int numCuentaDestino, double traspaso) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = lista[i];
            Cuenta cuentaOrigen = cliente.getCuentaNumCuneta(numCuentaOrigen);
            Cuenta cuentaDestino = cliente.getCuentaNumCuneta(numCuentaDestino);
            for (int j = 0; j < cliente.getCuentas().length; j++) {
                Cuenta cuenta = cliente.getCuentas()[i];
                if (cuenta.getNumCuenta() == numCuentaOrigen || cuenta.getNumCuenta() == numCuentaDestino) {
                    System.out.println("Una de las cuentas no existe");
                } else {
                    cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()-traspaso);
                    cuentaDestino.setSaldo(cuentaDestino.getSaldo()-traspaso);
                }
            }
        }
        return null;
    }

    @Override
    public void muestraCliente(int numCuenta) {
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = lista[i];
            for (int j = 0; j < cliente.getCuentas().length; j++) {
                Cuenta cuenta = cliente.getCuentas()[i];
                if (cuenta.getNumCuenta() == numCuenta) {
                    cliente.imprimeCliente();
                }
            }

        }
    }

    public void imprimeBanco() {
        System.out.println("En el banco " + nombre + " tienen cuentas los clientes: ");
        for (int i = 0; i < lista.length; i++) {
            Cliente clientes = lista[i];
            clientes.imprimeCliente();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getLista() {
        return lista;
    }

    public void setLista(Cliente[] lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) && Arrays.equals(lista, banco.lista);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(lista);
        return result;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", lista=" + Arrays.toString(lista) +
                '}';
    }
}
