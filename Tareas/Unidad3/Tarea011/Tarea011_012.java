import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_012 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean terminaCon(String texto, String sufijo) {
        return texto.endsWith(sufijo);
    }

    static void mostrarResultado(String texto, String sufijo) {
        System.out.println("\"" + texto + "\" termina con \"" + sufijo + "\"? " + terminaCon(texto, sufijo));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        String sufijo = leerTexto(entrada, "Ingrese el sufijo a verificar: ");
        mostrarResultado(primera, sufijo);
        mostrarResultado(segunda, sufijo);
        entrada.close();
    }
}
