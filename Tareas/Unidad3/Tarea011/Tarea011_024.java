import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_024 {

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

    static String reemplazarCaracter(String texto, char viejo, char nuevo) {
        return texto.replace(viejo, nuevo);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char viejo = leerCaracter(entrada, "Caracter a reemplazar: ");
        char nuevo = leerCaracter(entrada, "Caracter nuevo: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena nueva: " + reemplazarCaracter(texto, viejo, nuevo));
        entrada.close();
    }
}
