import java.util.Scanner;

public class Tarea011_014 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean sonIgualesSinMayusculas(String primera, String segunda) {
        return primera.equalsIgnoreCase(segunda);
    }

    static void mostrarResultado(String base, String otra) {
        System.out.println("\"" + base + "\" es igual a \"" + otra + "\" ignorando mayusculas? "
                + sonIgualesSinMayusculas(base, otra));
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
