import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_009 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean sonIguales(String cadena, CharSequence secuencia) {
        return cadena.contentEquals(secuencia);
    }

    static void mostrarComparacion(String cadena, String secuencia) {
        System.out.println("Comparando " + cadena + " y " + secuencia + ": " + sonIguales(cadena, secuencia));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String referencia = leerTexto(entrada, "Ingrese la secuencia de referencia: ");
        String primera = leerTexto(entrada, "Ingrese la primera cadena a comparar: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena a comparar: ");
        mostrarComparacion(primera, referencia);
        mostrarComparacion(segunda, referencia);
        entrada.close();
    }
}
