import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_057 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String intercambiarUltimosDos(String texto) {
        int n = texto.length();
        return texto.substring(0, n - 2) + texto.charAt(n - 1) + texto.charAt(n - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena (minimo 2 caracteres): ");
        System.out.println("La cadena dada es: " + texto);
        if (texto.length() < 2) {
            System.out.println("La cadena debe tener dos o mas caracteres");
        } else {
            System.out.println("La cadena despues de intercambiar los ultimos dos caracteres es: " + intercambiarUltimosDos(texto));
        }
        entrada.close();
    }
}
