package org.iesfm.coche;

import java.util.Scanner;

public class MainVehiculos {
    static Scanner scanner = new Scanner(System.in);
    private static Object Vehiculo;

    static int pidenumeros() {
        int numeros = scanner.nextInt();
        scanner.nextLine();
        while (numeros < 1) {
            System.out.println("El numero debe ser mayor que uno");
            numeros = scanner.nextInt();
            scanner.nextLine();
        }
        return numeros;
    }

    //    static void printVehiculo(org.iesfm.coche.Vehiculo vehiculo){
//        System.out.println("La marca es: " + vehiculo.marca);
//        System.out.println("El modelo es: " + vehiculo.modelo);
//        System.out.println("Tiene "+ vehiculo.km + " km  recorridos");
//        System.out.println("La matricula es: " + vehiculo.matricula);
//    }
    static Vehiculo[] vehiculos() {
        System.out.println("Escriba el numero de coches que quiera almacenar");
        Vehiculo[] vehiculos = new Vehiculo[pidenumeros()];
        System.out.println("Escriba los coches que quieres guardar");
        for (int i = 0; i < vehiculos.length; i++) {
            Vehiculo coche=pideCoche();
            vehiculos[i] = coche;
        }
        return vehiculos;
    }

    static void imprimeMatricula(Vehiculo[] vehiculos) {

        for (int i = 0; i < vehiculos.length; i++) {
            Vehiculo coche= vehiculos[i];
            System.out.println(coche.getMatricula());
        }

    }

    static Vehiculo pideCoche() {
        System.out.println("Introduce la marca");
        String marca = scanner.nextLine();
        System.out.println("Introduce el modelo");
        String modelo = scanner.nextLine();
        System.out.println("Introduce la matricula");
        String matricula = scanner.nextLine();
        System.out.println("Introduce los kilometros recorridos");
        int km = scanner.nextInt();
        scanner.nextLine();
        Vehiculo coche1 = new Vehiculo(marca, modelo, matricula, km);

        return coche1;
    }

    public static void main(String[] args) {
//        System.out.println("Introduce los valores de un coche");
//        Vehiculo coche1 = pideCoche();
////        Focus.marca="Ford";
////        Focus.modelo="Focus";
////        Focus.km=50000;
////        Focus.matricula="4345 JVS";
//        System.out.println("Introduce los valores del segundo coche");
//        Vehiculo coche2 = pideCoche();
////        Leon.marca="Seat";
////        Leon.modelo="Len";
////        Leon.km=5000;
////        Leon.matricula="3455 EDD";
//        System.out.println("El primer coche es: ");
//        coche1.printVehiculo();
//        System.out.println("El segundo coche es: ");
//        coche2.printVehiculo();
//        printVehiculo(Focus);
//        printVehiculo(Leon);
        Vehiculo[] vehiculos= vehiculos();
        imprimeMatricula(vehiculos);

    }

    }




