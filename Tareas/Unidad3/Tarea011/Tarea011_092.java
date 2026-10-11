import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_092 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarTodas(String principal, String quitar) {
        if (quitar.isEmpty()) {
            return principal;
        }
        return principal.replace(quitar, "");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String principal = leerTexto(entrada, "Ingrese la cadena principal: ");
        String quitar = leerTexto(entrada, "Ingrese la cadena a quitar: ");
        System.out.println("La cadena principal es: " + principal);
        System.out.println("La cadena a quitar es: " + quitar);
        System.out.println("La nueva cadena es: " + quitarTodas(principal, quitar));
        entrada.close();
    }
}
