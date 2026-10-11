import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_017 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char[] obtenerArreglo(String texto) {
        return texto.toCharArray();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char[] arreglo = obtenerArreglo(texto);
        System.out.println("La referencia del arreglo de caracteres es \"" + arreglo + "\"");
        System.out.println("Contenido del arreglo: " + Arrays.toString(arreglo));
        System.out.println("Cadena reconstruida: " + String.valueOf(arreglo));
        entrada.close();
    }
}
