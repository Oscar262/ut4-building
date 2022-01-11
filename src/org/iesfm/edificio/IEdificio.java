package org.iesfm.edificio;

public interface IEdificio {

    void informacionEdificio();
    void muestraPrimeraPLanta();
    Apartamento muestraApartamento(int numPlanta, String puerta);
    Propietario[] muestraPropietario(int numPlanta, String puerta);
}
