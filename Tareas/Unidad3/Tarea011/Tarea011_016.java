import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Tarea011_016 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static byte[] obtenerBytes(String texto) {
        return texto.getBytes(StandardCharsets.UTF_8);
    }

    static String reconstruirCadena(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        byte[] bytes = obtenerBytes(texto);
        System.out.println("Cantidad de bytes: " + bytes.length);
        System.out.println("La nueva cadena es igual a " + reconstruirCadena(bytes));
        entrada.close();
    }
}
