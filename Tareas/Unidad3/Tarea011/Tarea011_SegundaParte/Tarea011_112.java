import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_112 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean sePuedeConstruir(String primera, String segunda) {
        int[] disponibles = new int[65536];
        for (int i = 0; i < primera.length(); i++) {
            disponibles[primera.charAt(i)]++;
        }
        for (int i = 0; i < segunda.length(); i++) {
            if (--disponibles[segunda.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("La primera cadena contiene las letras de la segunda:");
        System.out.println(sePuedeConstruir(primera, segunda));
        entrada.close();
    }
}
