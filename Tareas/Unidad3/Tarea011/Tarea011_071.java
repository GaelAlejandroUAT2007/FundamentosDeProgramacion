import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_071 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean unaTerminaEnLaOtra(String primera, String segunda) {
        String a = primera.toLowerCase();
        String b = segunda.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y " + segunda);
        System.out.println("Una cadena aparece al final de la otra? " + unaTerminaEnLaOtra(primera, segunda));
        entrada.close();
    }
}
