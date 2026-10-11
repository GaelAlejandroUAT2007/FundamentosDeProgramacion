import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_091 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean terminaEnMOrN(String palabra) {
        char ultimo = Character.toLowerCase(palabra.charAt(palabra.length() - 1));
        return ultimo == 'm' || ultimo == 'n';
    }

    static int contarPalabras(String texto) {
        int total = 0;
        String limpio = texto.trim();
        if (limpio.isEmpty()) {
            return 0;
        }
        for (String palabra : limpio.split("\\s+")) {
            if (terminaEnMOrN(palabra)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese el texto: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero de palabras que terminan en m o n es: " + contarPalabras(texto));
        entrada.close();
    }
}
