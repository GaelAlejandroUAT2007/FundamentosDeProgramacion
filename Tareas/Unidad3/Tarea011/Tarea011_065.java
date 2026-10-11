import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_065 {

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

    static String quitarExtremos(String texto, char caracter) {
        if (texto.length() == 0) {
            return texto;
        }
        if (texto.length() == 1) {
            return texto.charAt(0) == caracter ? "" : texto;
        }
        if (texto.charAt(0) == caracter) {
            texto = texto.substring(1);
        }
        if (texto.length() > 0 && texto.charAt(texto.length() - 1) == caracter) {
            texto = texto.substring(0, texto.length() - 1);
        }
        return texto;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar de los extremos: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarExtremos(texto, caracter));
        entrada.close();
    }
}
