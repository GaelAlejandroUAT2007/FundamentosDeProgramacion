import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_007 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String concatenar(String primera, String segunda) {
        return primera.concat(segunda);
    }

    static void mostrarResultado(String primera, String segunda, String resultado) {
        System.out.println("Cadena 1: " + primera);
        System.out.println("Cadena 2: " + segunda);
        System.out.println("La cadena concatenada: " + resultado);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la cadena 1: ");
        String segunda = leerTexto(entrada, "Ingrese la cadena 2: ");
        mostrarResultado(primera, segunda, concatenar(primera, segunda));
        entrada.close();
    }
}
