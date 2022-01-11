package org.iesfm.instituto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int pideNum() {
        int num = scanner.nextInt();
        scanner.nextLine();
        while (num < 1) {
            System.out.println("El numero debe ser positivo");
            num = scanner.nextInt();
            scanner.nextLine();
        }
        return num;
    }

    static Alumno pideAlumno() {
        System.out.println("Escriba el nombre del alumno");
        String nombreAlumno = scanner.nextLine();
        System.out.println("Escriba los apellidos del alumno");
        String apellidos = scanner.nextLine();
        System.out.println("Escriba el codigo postal del alumno");
        int codigoPostal = scanner.nextInt();
        scanner.nextLine();
        Alumno alummno = new Alumno(nombreAlumno, apellidos, codigoPostal);
        return alummno;
    }

    static Grupo pideGrupos() {
        System.out.println("Escriba el aula");
        String aula = scanner.nextLine();
        Alumno[] alumnos = guardaAlumno();
        Grupo grupos = new Grupo(aula, alumnos);
        return grupos;
    }

    static Instituto pideInstituto() {
        System.out.println("Escriba el nombre del instituto");
        String nombre = scanner.nextLine();
        Grupo[] grupo = guardaGrupo();
        Instituto instituto = new Instituto(nombre, grupo);
        return instituto;
    }

    static Alumno[] guardaAlumno() {
        System.out.println("Escriba cuantos alumnos quiere guardar");
        Alumno[] listaAlumnos = new Alumno[pideNum()];
        for (int i = 0; i < listaAlumnos.length; i++) {
            Alumno alumno = pideAlumno();
            listaAlumnos[i] = alumno;
        }
        return listaAlumnos;
    }

    static Grupo[] guardaGrupo() {
        System.out.println("Escriba cuantos grupos quiere guardar");
        Grupo[] listaGrupos = new Grupo[pideNum()];
        for (int i = 0; i < listaGrupos.length; i++) {
            Grupo grupo = pideGrupos();
            listaGrupos[i] = grupo;
        }
        return listaGrupos;
    }

    public static void main(String[] args) {
        Instituto fm = pideInstituto();
        fm.imprimeInstituto();

    }
}
