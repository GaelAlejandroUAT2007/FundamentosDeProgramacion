import java.util.LinkedHashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Tarea011_033 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static void generarIntercalados(String primera, String segunda, String actual, Set<String> resultado) {
        if (primera.isEmpty() && segunda.isEmpty()) {
            resultado.add(actual);
            return;
        }
        if (!primera.isEmpty()) {
            generarIntercalados(primera.substring(1), segunda, actual + primera.charAt(0), resultado);
        }
        if (!segunda.isEmpty()) {
            generarIntercalados(primera, segunda.substring(1), actual + segunda.charAt(0), resultado);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        Set<String> resultado = new LinkedHashSet<>();
        generarIntercalados(primera, segunda, "", resultado);
        System.out.println("Las cadenas dadas son: " + primera + "  " + segunda);
        System.out.println("Las cadenas intercaladas son:");
        for (String cadena : resultado) {
            System.out.println(cadena);
        }
        System.out.println("Total: " + resultado.size());
        entrada.close();
    }
}
