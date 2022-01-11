package org.iesfm.persona;

public class MainPersona {


    public static void main(String[] args) {

        Persona pepa = new Persona("Pepa","Pig");
        Persona george = new Persona("George","Pig");

        System.out.println("Esta es pepa");
        pepa.printpersona();
        System.out.println("Este es george");
        george.setApellidos("Perez");
        george.printpersona();
        System.out.println(pepa.getNombre());
        System.out.println(george.getNombre());
    }
}
