package org.iesfm.Biblioteca;

public interface IBiblioteca {

    void muestraLibros();
    void muestraLibrosGenero(String genero);
    void datosSocios();
    void datosCP(int cp);
    void prestamosNIF(String nif);
    void prestamosNumSocio(int numSocio);
    boolean prestamoISBN(int isbn, int numSocio);
    Libro prestamoSocio(String nif);

}
