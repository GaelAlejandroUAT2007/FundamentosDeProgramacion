import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_109 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String invertir(String palabra) {
        return new StringBuilder(palabra).reverse().toString();
    }

    static String invertirPalabrasImpares(String texto) {
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                palabras[i] = invertir(palabras[i]);
            }
        }
        return String.join(" ", palabras);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese el texto: ");
        System.out.println("Texto original: " + texto);
        System.out.println();
        System.out.println("Texto con las palabras de longitud impar invertidas:");
        System.out.println(invertirPalabrasImpares(texto));
        entrada.close();
    }
}
