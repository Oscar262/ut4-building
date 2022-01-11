package org.iesfm.banco;

public interface IBanco {
    void muestraListaClientes();
    void muestraCuentas(String nif);
    void muestraCuenta(String nif, int numCuenta);
    Cliente ingreso(String nif, int numCuenta, double ingreso);
    Cliente sacarDinero(String nif, int numCuenta, double dineroSacado);
    Cliente traspaso(String nif, int numCuentaOrigen, int numCuentaDestino,double traspaso);
    Cliente traspaso2Clientes(String nif1, String nif2, int numCuentaOrigen, int numCuentaDestino, double traspaso);
    Cuenta traspaso2Cuentas(int numCuentaOrigen, int numCuentaDestino, double traspaso);
    void muestraCliente(int numCuenta);



}
