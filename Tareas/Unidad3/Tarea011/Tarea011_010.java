import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_010 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean sonIguales(String cadena, StringBuffer buffer) {
        return cadena.contentEquals(buffer);
    }

    static void mostrarComparacion(String cadena, StringBuffer buffer) {
        System.out.println("Comparando " + cadena + " y " + buffer + ": " + sonIguales(cadena, buffer));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer referencia = new StringBuffer(leerTexto(entrada, "Ingrese el contenido del StringBuffer: "));
        String primera = leerTexto(entrada, "Ingrese la primera cadena a comparar: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena a comparar: ");
        mostrarComparacion(primera, referencia);
        mostrarComparacion(segunda, referencia);
        entrada.close();
    }
}
