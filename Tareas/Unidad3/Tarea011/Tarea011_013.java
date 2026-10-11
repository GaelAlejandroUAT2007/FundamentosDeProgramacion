import java.util.Scanner;

public class Tarea011_013 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean sonIguales(String primera, String segunda) {
        return primera.equals(segunda);
    }

    static void mostrarResultado(String base, String otra) {
        System.out.println("\"" + base + "\" es igual a \"" + otra + "\"? " + sonIguales(base, otra));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String base = leerTexto(entrada, "Ingrese la cadena base: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        String tercera = leerTexto(entrada, "Ingrese la tercera cadena: ");
        mostrarResultado(base, segunda);
        mostrarResultado(base, tercera);
        entrada.close();
    }
}
