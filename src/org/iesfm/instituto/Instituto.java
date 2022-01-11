package org.iesfm.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Instituto {
    private String nombreInstituto;
    private Grupo[] grupos;

    public Instituto(String nombre, Grupo[] grupos) {
        this.nombreInstituto = nombre;
        this.grupos = grupos;
    }

    public void imprimeInstituto(){
        System.out.println("En el instituto "+nombreInstituto);
        for (int i = 0; i < grupos.length; i++) {
            Grupo grupo=grupos[i];
            grupo.imprimeGrupo();
        }
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombreInstituto, instituto.nombreInstituto) && Arrays.equals(grupos, instituto.grupos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombreInstituto);
        result = 31 * result + Arrays.hashCode(grupos);
        return result;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombreInstituto='" + nombreInstituto + '\'' +
                ", grupos=" + Arrays.toString(grupos) +
                '}';
    }

}