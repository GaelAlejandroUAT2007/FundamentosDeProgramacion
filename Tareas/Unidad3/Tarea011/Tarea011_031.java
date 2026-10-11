import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_031 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarEspacios(String texto) {
        return texto.trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena con espacios al inicio o al final: ");
        System.out.println("Cadena original: [" + texto + "]");
        System.out.println("Cadena nueva: " + quitarEspacios(texto));
        entrada.close();
    }
}
