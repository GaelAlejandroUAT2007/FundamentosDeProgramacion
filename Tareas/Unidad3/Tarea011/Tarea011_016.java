import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_016 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static byte[] obtenerBytes(String texto) {
        return texto.getBytes(StandardCharsets.UTF_8);
    }

    static String reconstruirCadena(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        byte[] bytes = obtenerBytes(texto);
        System.out.println("Cantidad de bytes: " + bytes.length);
        System.out.println("La nueva cadena es igual a " + reconstruirCadena(bytes));
        entrada.close();
    }
}
