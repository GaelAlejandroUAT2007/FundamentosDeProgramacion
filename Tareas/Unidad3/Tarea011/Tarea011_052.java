import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_052 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean sonRotaciones(String primera, String segunda) {
        if (primera.length() != segunda.length()) {
            return false;
        }
        String duplicada = primera + primera;
        return duplicada.contains(segunda);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y  " + segunda);
        System.out.println();
        System.out.println("La concatenacion de la 1a cadena dos veces es: " + primera + primera);
        if (sonRotaciones(primera, segunda)) {
            System.out.println("La 2a cadena " + segunda + "  existe en la nueva cadena.");
            System.out.println();
            System.out.println("Las cadenas son rotaciones una de la otra");
        } else {
            System.out.println("Las cadenas no son rotaciones una de la otra");
        }
        entrada.close();
    }
}
