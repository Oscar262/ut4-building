package org.iesfm.Empresa;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int pidePos() {
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n < 1) {
            System.out.println("El numero debe ser positivo");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        return n;
    }

    static int pideEntero() {
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    static double pideDouble() {
        double n = scanner.nextDouble();
        scanner.nextLine();
        return n;
    }

    static Empleado infoEmpleados() {
        System.out.println("Introduce el NIF");
        String nif = scanner.nextLine();
        System.out.println("Introduzca el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce los apellidos");
        String apellidos = scanner.nextLine();
        System.out.println("Introduzca el puesto");
        String puesto = scanner.nextLine();
        return new Empleado(nif, nombre, apellidos, puesto);
    }

    static Empleado[] guardaEmpleados() {
        System.out.println("Escriba cuantos empleados quiere guardar");
        Empleado[] lista = new Empleado[pidePos()];
        for (int i = 0; i < lista.length; i++) {
            Empleado empleado = infoEmpleados();
            lista[i] = empleado;
        }
        return lista;
    }

//    static Departamento infoDepartamento()
//{
//    sout "Introduce los departamentos por comas
//    String departamentos= scanner.nextLine();
//    String[] departamentos=departamentos.split(",")
//}

    static Departamento infoDepartamento() {
        System.out.println("Introduce el nombre del departamento");
        String departamento = scanner.nextLine();
        Empleado[] listaempleados = guardaEmpleados();
        return new Departamento(departamento, listaempleados);
    }

    static Departamento[] guardaDepartamentos() {
        System.out.println("Escriba cuanto empleados quiere guardar");
        Departamento[] lista = new Departamento[pidePos()];
        for (int i = 0; i < lista.length; i++) {
            Departamento departamento = infoDepartamento();
            lista[i] = departamento;
        }
        return lista;
    }

    static Empresa infoEmpresa() {
        System.out.println("Introduzca el nombre de la empresa");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el CIF de la empressa");
        String cif = scanner.nextLine();
        Departamento[] listaDepartamentos = guardaDepartamentos();
        return new Empresa(nombre, cif, listaDepartamentos);
    }

    public static void main(String[] args) {
        Empresa empresa1=infoEmpresa();
        System.out.println("Introduce un NIF para encontrar un empleado");
        empresa1.datosEmpleado(scanner.nextLine());
        System.out.println("Introduce el nombre de un departamento para conocer suinformacion");
        empresa1.datosDepartamento(scanner.nextLine());
        System.out.println("Introduce el nombre de un departamento para conocer los empleados que trabajan en el");
        empresa1.empleados(scanner.nextLine());
    }
}
