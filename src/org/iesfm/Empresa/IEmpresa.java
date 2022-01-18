package org.iesfm.Empresa;

import org.iesfm.Empresa.exceptions.DepartmentNotFoundException;
import org.iesfm.Empresa.exceptions.EmployeeNotFoundExceptions;

public interface IEmpresa {

    Empleado[] empleados(String nombre) throws EmployeeNotFoundExceptions;
    Departamento datosDepartamento(String nombre) throws DepartmentNotFoundException;
    Empleado datosEmpleado(String nif) throws DepartmentNotFoundException;
}
