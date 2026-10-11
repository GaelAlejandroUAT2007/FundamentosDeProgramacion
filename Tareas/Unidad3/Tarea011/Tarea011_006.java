import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_006 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int compararIgnorandoMayusculas(String primera, String segunda) {
        return primera.compareToIgnoreCase(segunda);
    }

    static String describir(String primera, String segunda, int resultado) {
        if (resultado < 0) {
            return "\"" + primera + "\" es menor que \"" + segunda + "\"";
        }
        if (resultado > 0) {
            return "\"" + primera + "\" es mayor que \"" + segunda + "\"";
        }
        return "\"" + primera + "\" es igual a \"" + segunda + "\"";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la cadena 1: ");
        String segunda = leerTexto(entrada, "Ingrese la cadena 2: ");
        int resultado = compararIgnorandoMayusculas(primera, segunda);
        System.out.println("Cadena 1: " + primera);
        System.out.println("Cadena 2: " + segunda);
        System.out.println(describir(primera, segunda, resultado));
        entrada.close();
    }
}
