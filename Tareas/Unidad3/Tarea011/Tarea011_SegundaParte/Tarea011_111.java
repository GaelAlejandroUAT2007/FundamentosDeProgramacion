import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_111 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarPalabra(String texto, String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (String actual : texto.trim().split("\\s+")) {
            if (!actual.equals(palabra)) {
                if (resultado.length() > 0) {
                    resultado.append(' ');
                }
                resultado.append(actual);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese una cadena: ");
        String palabra = leerTexto(entrada, "Ingrese una palabra a quitar: ");
        System.out.println("Nueva cadena, despues de quitar la palabra:");
        System.out.println(quitarPalabra(texto, palabra));
        entrada.close();
    }
}
