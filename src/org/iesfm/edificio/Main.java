package org.iesfm.edificio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int pideNumero() {
        Integer num = null;
        while (num == null) {
            try {
                num = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Debe ser un numero entero");
            }
        }
        return num;
    }

    static int pidePositivo(){
        int num=pideNumero();
        while (num < 1) {
            System.out.println("Debe ser mayor que uno");
            num = scanner.nextInt();
            scanner.nextLine();
        }
        return num;
    }

    static Propietario infoPropietario() {
        System.out.println("Introuduzca el nombre del propietario");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido del propietario");
        String apellido = scanner.nextLine();
        Propietario propietario = new Propietario(nombre, apellido);
        return propietario;
    }

    static Apartamento infoApartamento() {
        System.out.println("Introduce el número de la planta");
        int numero=pideNumero();
        System.out.println("Introduce la puerta");
        String puerta = scanner.nextLine();
        Propietario[] propietarios = guardaPropietarios();
        Apartamento apartamento = new Apartamento(numero, puerta, propietarios);
        return apartamento;
    }

    static Edificio infoEdificio() {
        System.out.println("Introduce la direccion");
        String direccion = scanner.nextLine();
        System.out.println("Introduce el municipio");
        String municipio = scanner.nextLine();
        Apartamento[] apartamentos = guardaApartamentos();
        Edificio edificio = new Edificio(direccion, municipio, apartamentos);
        return edificio;
    }

    static Propietario[] guardaPropietarios() {
        System.out.println("Escriba cuantos propietarios quiere guardar");
        Propietario[] propietarios = new Propietario[pidePositivo()];
        for (int i = 0; i < propietarios.length; i++) {
            Propietario propietario = infoPropietario();
            propietarios[i] = propietario;
        }
        return propietarios;
    }

    static Apartamento[] guardaApartamentos() {
        System.out.println("Escriba cuantos apartamentos quiere guardar");
        Apartamento[] apartamentos = new Apartamento[pidePositivo()];
        for (int i = 0; i < apartamentos.length; i++) {
            Apartamento apartamento = infoApartamento();
            apartamentos[i] = apartamento;
        }
        return apartamentos;
    }

    public static void main(String[] args) {
        Edificio edificio1 = infoEdificio();
        edificio1.informacionEdificio();
        System.out.println("Estos son los apartamentos de la primera planta");
        edificio1.muestraPrimeraPLanta();
        System.out.println("Introduce la planta y la puerta que busca");
        edificio1.muestraApartamento(pidePositivo(), scanner.nextLine());
        System.out.println("Introduce la planta y la puerta de la que busca al propietario");
        edificio1.muestraPropietario(pidePositivo(), scanner.nextLine());

    }
}
