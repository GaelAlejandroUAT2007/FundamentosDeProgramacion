import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_108 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean tieneLetrasConsecutivasIguales(String palabra) {
        for (int i = 0; i + 1 < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i)) && palabra.charAt(i) == palabra.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String linea = leerTexto(entrada, "Ingrese las palabras separadas por espacio: ");
        for (String palabra : linea.trim().split("\\s+")) {
            System.out.println("Palabra original: " + palabra);
            System.out.println("Hay dos letras consecutivas identicas en la cadena: " + tieneLetrasConsecutivasIguales(palabra));
        }
        entrada.close();
    }
}
