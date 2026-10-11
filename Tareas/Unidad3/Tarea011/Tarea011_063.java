import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_063 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean primerosDosAlFinal(String texto) {
        if (texto.length() < 2) {
            return false;
        }
        return texto.endsWith(texto.substring(0, 2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los primeros dos caracteres aparecen al final: " + primerosDosAlFinal(texto));
        entrada.close();
    }
}
