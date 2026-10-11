import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_069 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String entreToasts(String texto) {
        int primero = texto.indexOf("toast");
        int ultimo = texto.lastIndexOf("toast");
        if (primero == -1 || primero == ultimo) {
            return "";
        }
        return texto.substring(primero + 5, ultimo);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + entreToasts(texto));
        entrada.close();
    }
}
