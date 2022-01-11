package org.iesfm.EjerPers;

public class MainPersona {
//    static void saluda(Persona persona){
//        System.out.println("Hola soy " + persona.getNombre() + " " + persona.getApellido() + " y mi DNI es " + persona.getNif());
//    }
//static void despedida(Persona persona){
//    System.out.println("Hasta la próxima! Firmado " + persona.getNombre());
//}
    public static void main(String[] args) {

        Persona Oscar = new Persona("Óscar", "Sánchez Navas", "", 19);
        Oscar.saluda();
        Oscar.despedida();
//saluda(Oscar);
//despedida(Oscar);
//
}
}
