package org.iesfm.banco;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int pideInt() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    static double pideDouble() {
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

    static int pidePositivo() {
        int num = pideInt();
        while (num < 1) {
            System.out.println("El numero debe ser positivo");
            num = pideInt();
        }
        return num;
    }

    static Cuenta infoCuentas() {
        System.out.println("Introduzca el numero de cuenta");
        int numCuenta = pideInt();
        System.out.println("Introduzca el saldo de la cuenta");
        double saldo = pideDouble();
        Cuenta cuentas = new Cuenta(numCuenta, saldo);
        return cuentas;
    }

    static Cliente infocliente() {
        System.out.println("Introduzca el nombre y los apellidos del cliente");
        String nombreApellidos = scanner.nextLine();
        System.out.println("Introduzca el NIF del cliente");
        String nif = scanner.nextLine();
        Cuenta[] cuentas = guardaCuenta();
        Cliente clientes = new Cliente(nombreApellidos, nif, cuentas);
        return clientes;
    }

    static Banco infoBanco() {
        System.out.println("Introduce el nombre del banco");
        String nombre = scanner.nextLine();
        Cliente[] clientes = guardaClientes();
        Banco bancos = new Banco(nombre, clientes);
        return bancos;
    }

    static Cuenta[] guardaCuenta() {
        System.out.println("Escriba cuantas cuentas quiere guardar");
        Cuenta[] lista = new Cuenta[pidePositivo()];
        for (int i = 0; i < lista.length; i++) {
            Cuenta cuenta = infoCuentas();
            lista[i] = cuenta;
        }
        return lista;
    }

    static Cliente[] guardaClientes() {
        System.out.println("Escriba cuantos clientes quiere guardar");
        Cliente[] lista = new Cliente[pidePositivo()];
        for (int i = 0; i < lista.length; i++) {
            Cliente cliente = infocliente();
            lista[i] = cliente;
        }
        return lista;
    }

    public static void main(String[] args) {
        Banco banco1 = infoBanco();
        banco1.muestraListaClientes();
        System.out.println("Introduce un nif para buscar las cuentas del cliente");
        banco1.muestraCuentas(scanner.nextLine());
        System.out.println();
        System.out.println("Introduce un numero de cuenta y un NIF para ver los datos de la cuenta");
        banco1.muestraCuenta(scanner.nextLine(), pidePositivo());
        System.out.println("Introduce un NIF un numero de cuenta y un cantidad para ingresar en la cuenta");
        banco1.ingreso(scanner.nextLine(), pidePositivo(), pideDouble());
        System.out.println("Introduce un NIF un numero de cuenta y un cantidad para sacar de la cuenta");
        banco1.sacarDinero(scanner.nextLine(), pidePositivo(), pideDouble());
        System.out.println("Introduce un NIF un numero de cuenta y otro de la cuenta en la que quieres ingresar, y ademñas un cantidad para ingresar en la cuenta");
        banco1.traspaso(scanner.nextLine(), pidePositivo(),pidePositivo(),pideDouble());
        System.out.println("Introduce dos NIFS, dos numeros de cuenta y la cantidad que quieres traspasar");
        banco1.traspaso2Clientes(scanner.nextLine(), scanner.nextLine(), pidePositivo(),pidePositivo(),pideDouble());
        System.out.println("Introduzca dos numeros de cuenta y la cantidad a traspasar");
        banco1.traspaso2Cuentas(pidePositivo(),pidePositivo(),pideDouble());
        System.out.println("Introduce un numero de cuenta para mostrar los datos del cliente");
        banco1.muestraCliente(pidePositivo());
    }
}
