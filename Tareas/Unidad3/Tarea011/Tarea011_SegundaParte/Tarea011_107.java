import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_107 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char leerCaracter(BufferedReader entrada, String mensaje) throws IOException {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.readLine();
        } while (linea.isEmpty());
        return linea.charAt(0);
    }

    static int contarCaracter(String texto, char caracter) {
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a contar: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("El caracter '" + caracter + "' aparece " + contarCaracter(texto, caracter) + " veces");
        entrada.close();
    }
}
