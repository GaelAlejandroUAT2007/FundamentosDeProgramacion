import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_026 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean empiezaCon(String texto, String prefijo) {
        return texto.startsWith(prefijo);
    }

    static void mostrarResultado(String texto, String prefijo) {
        System.out.println(texto + " empieza con " + prefijo + "? " + empiezaCon(texto, prefijo));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        String prefijo = leerTexto(entrada, "Ingrese el prefijo a verificar: ");
        mostrarResultado(primera, prefijo);
        mostrarResultado(segunda, prefijo);
        entrada.close();
    }
}
