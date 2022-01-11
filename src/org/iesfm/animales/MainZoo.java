package org.iesfm.animales;

import java.util.Scanner;

public class MainZoo {

    private static Scanner scanner = new Scanner(System.in);

    static int pideNum() {
        int num = scanner.nextInt();
        scanner.nextLine();
        while (num < 1) {
            System.out.println("El numero debe ser mayor que cero");
            num = scanner.nextInt();
            scanner.nextLine();
        }
        return num;
    }

    static Zoo infoZoo(Animal[] listaAnimales) {
        System.out.println("El nombre del zoo es :");
        String nombre = scanner.nextLine();
        listaAnimales = Animales();
        Zoo zoos = new Zoo(nombre, listaAnimales);
        return zoos;
    }

    static Animal pideAnimal() {

        System.out.println("La especie del animal es :");
        String especie = scanner.nextLine();
        System.out.println("La edad del animal es :");
        int edad = scanner.nextInt();
        scanner.nextLine();
        while (edad < 0) {
            System.out.println("La edad de un animal debe ser un numero positivo");
            edad = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("La jaula del animal es :");
        int jaula = scanner.nextInt();
        scanner.nextLine();
        System.out.println("La alimentacion del animal es :");
        String alimentacion = scanner.nextLine();
        while (!alimentacion.equalsIgnoreCase("carnivoro")
                && !alimentacion.equalsIgnoreCase("herbivoro")
                && !alimentacion.equalsIgnoreCase("omnivoro")) {
            System.out.println("La alimentacion de los animales debe ser carnívoro, herbívoro u omnívoro");
            alimentacion = scanner.nextLine();
        }
        Animal animales = new Animal(especie, edad, jaula, alimentacion);
        return animales;
    }

    static Animal[] Animales() {

        System.out.println("Escriba cuantos animales desea guardar");
        Animal[] listaAnimales = new Animal[pideNum()];
        for (int i = 0; i < listaAnimales.length; i++) {
            Animal animal = pideAnimal();
            listaAnimales[i] = animal;
        }
        return listaAnimales;
    }

    static void imprimeCarnivoros(Animal[] listaAnimales) {
        for (Animal animal : listaAnimales) {
            if (animal.getAlimentacion().equalsIgnoreCase("Carnivoro")) {
                animal.imprimeAnimal();
            }

        }
    }

    static void imprimeHerviboros(Animal[] listaAnimales) {
        for (Animal animal : listaAnimales) {
            if (animal.getAlimentacion().equalsIgnoreCase("Herbivoro")) {
                animal.imprimeAnimal();
            }

        }
    }

    static void imprimeOmnivoros(Animal[] listaAnimales) {
        for (Animal animal : listaAnimales) {
            if (animal.getAlimentacion().equalsIgnoreCase("Omnivoro")) {
                animal.imprimeAnimal();
            }

        }
    }


    static void checkalim(Animal[] listaanimales) {
        System.out.println("que alimentacion tienen los animales que busca ");
        String buscaAlimentacion = scanner.nextLine();
        switch (buscaAlimentacion) {
            case "carnivoro":
                imprimeCarnivoros(listaanimales);
                break;
            case "herbivoro":
                imprimeHerviboros(listaanimales);
                break;
            case "omnivoro":
                imprimeOmnivoros(listaanimales);
                break;
            default:
                while (!buscaAlimentacion.equalsIgnoreCase("carnvioro") &&
                        !buscaAlimentacion.equalsIgnoreCase("herviboro") &&
                        !buscaAlimentacion.equalsIgnoreCase("omnivoro")) {
                    System.out.println("Debe buscar carnivoro, herviboro, u omnivoro");
                    buscaAlimentacion = scanner.nextLine();
                }
        }
    }

    static Zoo[] numZoos(Zoo infoZoo) {
        System.out.println("Escriba el numero de zoos que quiera guardar");
        int numZoos = pideNum();
        Zoo[] zoosGuardados = new Zoo[numZoos];
        for (int i = 0; i < zoosGuardados.length; i++) {
            infoZoo(Animales());
            zoosGuardados[i] = infoZoo;
        }
        return zoosGuardados;
    }


    public static void main(String[] args) {
        Zoo[] listaZoos = numZoos(infoZoo(Animales()));

    }
}



