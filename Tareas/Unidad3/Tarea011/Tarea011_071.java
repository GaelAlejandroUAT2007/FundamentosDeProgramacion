import java.util.Scanner;

public class Tarea011_071 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean unaTerminaEnLaOtra(String primera, String segunda) {
        String a = primera.toLowerCase();
        String b = segunda.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y " + segunda);
        System.out.println("Una cadena aparece al final de la otra? " + unaTerminaEnLaOtra(primera, segunda));
        entrada.close();
    }
}
