import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_110 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int contarCaracteresMasDeDosVeces(String texto) {
        int[] frecuencias = new int[65536];
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                frecuencias[c]++;
            }
        }
        int total = 0;
        for (int f : frecuencias) {
            if (f > 2) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Numero de caracteres duplicados en la cadena (aparecen mas de dos veces): "
                + contarCaracteresMasDeDosVeces(texto));
        entrada.close();
    }
}
