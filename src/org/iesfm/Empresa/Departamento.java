package org.iesfm.Empresa;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombreDepartamento;
    private Empleado[] listaEmpleados;

    public Departamento(String nombreDepartamento, Empleado[] listaEmpleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.listaEmpleados = listaEmpleados;
    }

    public void imprimeDepartamento() {
        System.out.println("El departamento " + nombreDepartamento);
    }

    public void muestraEmpleados() {
        for (int i = 0; i < listaEmpleados.length; i++) {
            Empleado empleado = listaEmpleados[i];
            empleado.imprimeEmpleado();
        }
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nombreDepartamento, that.nombreDepartamento) && Arrays.equals(listaEmpleados, that.listaEmpleados);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombreDepartamento);
        result = 31 * result + Arrays.hashCode(listaEmpleados);
        return result;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDepartamento='" + nombreDepartamento + '\'' +
                ", listaEmpleados=" + Arrays.toString(listaEmpleados) +
                '}';
    }
}
