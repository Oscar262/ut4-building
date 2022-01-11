package org.iesfm.Biblioteca;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int pidePos() {
        int num = pideEntero();
        while (num < 1) {
            System.out.println("El numero debe ser positivo");
            num = pideEntero();
        }
        return num;
    }

    static int pideEntero() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    static Libro libroInfo() {
        System.out.println("Introduzca el ISBN del libro");
        int isbn = pidePos();
        System.out.println("Introduce el título");
        String titulo = scanner.nextLine();
        System.out.println("Introduce el autor del libro");
        String autor = scanner.nextLine();
        System.out.println("Intorduce los generos del libro separados por comas");
        String genero = scanner.nextLine();
        String[] generos = genero.split(",");
        return new Libro(isbn, titulo, autor, generos);
    }

    static Socio socioInfo() {
        System.out.println("Introduzca el NIF del socio");
        String nif = scanner.nextLine();
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Intoduzca los apellidos");
        String apellidos = scanner.nextLine();
        System.out.println("Introduzca el numero del socio");
        int numSocio = pidePos();
        System.out.println("Introduce el codigo postal del socio");
        int cp = pidePos();
        return new Socio(nif, nombre, apellidos, numSocio, cp);
    }

    static Prestamo prestamoInfo() {
        System.out.println("Introduzca el ISBN del libro");
        int isbn = pidePos();
        System.out.println("Introduzca la fecha del prestamo");
        String fechaPrestamo = scanner.nextLine();
        System.out.println("Introduzca el NIF del socio que cogió el libro");
        String nif = scanner.nextLine();
        System.out.println("Introduzca la fecha en la que se devolvio el libro");
        String fechaDevolucion = scanner.nextLine();
        return new Prestamo(isbn, fechaPrestamo, fechaDevolucion, nif);
    }

    static Libro[] listaLibros() {
        System.out.println("Introduce cuantos libros tiene la biblioteca");
        Libro[] libros = new Libro[pidePos()];
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libroInfo();
            libros[i] = libro;
        }
        return libros;
    }

    static Socio[] listaSocios() {
        System.out.println("Introduce cuantos socios tiene la biblioteca");
        Socio[] socios = new Socio[pidePos()];
        for (int i = 0; i < socios.length; i++) {
            Socio socio = socioInfo();
            socios[i] = socio;
        }
        return socios;
    }

    static Prestamo[] listaprestamos() {
        System.out.println("Introduce cuantos prestamos tiene la biblioteca");
        Prestamo[] prestamos = new Prestamo[pidePos()];
        for (int i = 0; i < prestamos.length; i++) {
            Prestamo prestamo = prestamoInfo();
            prestamos[i] = prestamo;
        }
        return prestamos;
    }

    static Biblioteca bibliotecaInfo(){
        System.out.println("Introduce el nombre de la biblioteca");
        String nombre=scanner.nextLine();
        Libro[] libros=listaLibros();
        Socio[] socios=listaSocios();
        Prestamo[] prestamos=listaprestamos();
        return new Biblioteca(nombre, libros, socios, prestamos);
    }

    public static void main(String[] args) {
        Biblioteca biblioteca=bibliotecaInfo();
        biblioteca.muestraLibros();
        System.out.println("Introduce un genero para conocer los libros que tenemos de ese genero");
        biblioteca.muestraLibrosGenero(scanner.nextLine());
        biblioteca.datosSocios();
        System.out.println("Introduce un codigo postal para encontrar a todos nuestos socios con ese codigo postal");
        biblioteca.datosCP(pidePos());
        System.out.println("Introduce un NIF para encontrar los prestamos de ese socio");
        biblioteca.prestamosNIF(scanner.nextLine());
        System.out.println("Introduce un numero de socio para encontrar los prestamos de ese socio");
        biblioteca.prestamosNumSocio(pidePos());
        System.out.println("Introduce un ISBN para y un NIF para saber si un socio ha cogido prestado alguna vez ese libro");
        biblioteca.prestamoISBN(pidePos(), pidePos());

    }
}
