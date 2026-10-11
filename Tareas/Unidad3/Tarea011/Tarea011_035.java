import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_035 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static void generarPermutaciones(String texto, int longitud, String actual, int[] contador) {
        if (actual.length() == longitud) {
            System.out.println(actual);
            contador[0]++;
            return;
        }
        for (int i = 0; i < texto.length(); i++) {
            generarPermutaciones(texto, longitud, actual + texto.charAt(i), contador);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena (maximo 7 caracteres): ");
        if (texto.isEmpty() || texto.length() > 7) {
            System.out.println("La cadena debe tener entre 1 y 7 caracteres");
        } else {
            int[] contador = {0};
            System.out.println("La cadena dada es: " + texto);
            System.out.println("Las cadenas permutadas son:");
            generarPermutaciones(texto, texto.length(), "", contador);
            System.out.println("Total de permutaciones: " + contador[0]);
        }
        entrada.close();
    }
}
