package org.iesfm.Empresa;

public interface IEmpresa {

    Empleado[] empleados(String nombre);
    Departamento datosDepartamento(String nombre);
    Empleado datosEmpleado(String nif);
}
