import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_101 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean soloDigitos(String texto) {
        if (texto.isEmpty()) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Primera cadena:");
        System.out.println(primera);
        System.out.println(soloDigitos(primera));
        System.out.println();
        System.out.println("Segunda cadena:");
        System.out.println(segunda);
        System.out.println(soloDigitos(segunda));
        entrada.close();
    }
}
