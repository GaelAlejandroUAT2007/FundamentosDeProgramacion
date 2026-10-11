import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_034 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int[] contarFrecuencias(String texto) {
        int[] frecuencias = new int[65536];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }
        return frecuencias;
    }

    static int buscarMayor(String texto, int[] frecuencias) {
        int mayor = 0;
        for (int i = 0; i < texto.length(); i++) {
            mayor = Math.max(mayor, frecuencias[texto.charAt(i)]);
        }
        return mayor;
    }

    static int buscarSegundo(String texto, int[] frecuencias, int mayor) {
        int segundo = 0;
        for (int i = 0; i < texto.length(); i++) {
            int f = frecuencias[texto.charAt(i)];
            if (f < mayor && f > segundo) {
                segundo = f;
            }
        }
        return segundo;
    }

    static char segundoMasFrecuente(String texto) {
        int[] frecuencias = contarFrecuencias(texto);
        int mayor = buscarMayor(texto, frecuencias);
        int segundo = buscarSegundo(texto, frecuencias, mayor);
        if (segundo == 0) {
            return '\0';
        }
        for (int i = 0; i < texto.length(); i++) {
            if (frecuencias[texto.charAt(i)] == segundo) {
                return texto.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char resultado = segundoMasFrecuente(texto);
        System.out.println("La cadena dada es: " + texto);
        if (resultado == '\0') {
            System.out.println("No existe un segundo caracter mas frecuente");
        } else {
            System.out.println("El segundo caracter mas frecuente en la cadena es: " + resultado);
        }
        entrada.close();
    }
}
