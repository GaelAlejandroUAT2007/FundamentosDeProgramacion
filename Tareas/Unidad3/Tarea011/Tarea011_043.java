import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_043 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char masFrecuente(String texto) {
        int[] frecuencias = new int[65536];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }
        char resultado = texto.charAt(0);
        for (int i = 0; i < texto.length(); i++) {
            if (frecuencias[texto.charAt(i)] > frecuencias[resultado]) {
                resultado = texto.charAt(i);
            }
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        if (texto.isEmpty()) {
            System.out.println("La cadena esta vacia");
        } else {
            System.out.println("La cadena dada es: " + texto);
            System.out.println("El caracter que mas se repite en la cadena es: " + masFrecuente(texto));
        }
        entrada.close();
    }
}
