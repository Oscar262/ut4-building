package org.iesfm.Empresa;

import org.iesfm.Empresa.exceptions.DepartmentNotFoundException;
import org.iesfm.Empresa.exceptions.EmployeeNotFoundExceptions;

import java.util.Arrays;
import java.util.Objects;

public class Empresa implements IEmpresa {

    private String nombreEmpresa;
    private String cif;
    private Departamento[] listaDepartamentos;

    public Empresa(String nombreEmpresa, String cif, Departamento[] listaDepartamentos) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.listaDepartamentos = listaDepartamentos;
    }

    @Override
    public Empleado[] empleados(String nombre) throws EmployeeNotFoundExceptions {
        for (int i = 0; i < listaDepartamentos.length; i++) {
            Departamento departamento = listaDepartamentos[i];
            if (departamento.getNombreDepartamento().equals(nombre)) {
                return departamento.getListaEmpleados();
            }
        }
        throw new EmployeeNotFoundExceptions();
    }

    @Override
    public Departamento datosDepartamento(String nombre) throws DepartmentNotFoundException {
        for (int i = 0; i < listaDepartamentos.length; i++) {
            Departamento departamento = listaDepartamentos[i];
            if (departamento.getNombreDepartamento().equals(nombre)) {
                departamento.imprimeDepartamento();
                return departamento;
            }
        }
        throw new DepartmentNotFoundException();
    }


    @Override
    public Empleado datosEmpleado(String nif) throws DepartmentNotFoundException {
        for (int i = 0; i < listaDepartamentos.length; i++) {
            Departamento departamento = listaDepartamentos[i];
            for (int j = 0; j < departamento.getListaEmpleados().length; j++) {
                Empleado empleado = departamento.getListaEmpleados()[i];
                if (empleado.getNif().equals(nif)) {
                    empleado.imprimeEmpleado();
                    return empleado;
                }
            }
        }
        throw new DepartmentNotFoundException();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departamento[] getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(Departamento[] listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombreEmpresa, empresa.nombreEmpresa) && Objects.equals(cif, empresa.cif) && Arrays.equals(listaDepartamentos, empresa.listaDepartamentos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombreEmpresa, cif);
        result = 31 * result + Arrays.hashCode(listaDepartamentos);
        return result;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", cif='" + cif + '\'' +
                ", listaDepartamentos=" + Arrays.toString(listaDepartamentos) +
                '}';
    }

}
