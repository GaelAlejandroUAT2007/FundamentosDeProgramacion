import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_056 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String unirSinDobles(String primera, String segunda) {
        if (primera.isEmpty() || segunda.isEmpty()) {
            return primera + segunda;
        }
        if (primera.charAt(primera.length() - 1) == segunda.charAt(0)) {
            return primera + segunda.substring(1);
        }
        return primera + segunda;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y  " + segunda);
        System.out.println("La cadena despues de concatenar es: " + unirSinDobles(primera, segunda));
        entrada.close();
    }
}
