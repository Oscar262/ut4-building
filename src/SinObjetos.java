import java.util.Scanner;

public class SinObjetos {
    static Scanner scanner = new Scanner(System.in);

    static String pideNombre() {
        System.out.println("Introduce el nombre");
        return scanner.nextLine();
    }
    static String pideApelidos(){
        System.out.println("Introduce los apellidos");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nombre1=pideNombre();
        String apellidos1=pideApelidos();
    }
}
