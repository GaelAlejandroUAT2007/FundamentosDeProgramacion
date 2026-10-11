import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_106 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String repetir(String texto, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(texto);
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int veces = leerEntero(entrada, "Ingrese el numero de repeticiones: ");
        System.out.println("Cadena original: " + texto);
        System.out.println();
        if (veces < 0) {
            System.out.println("El numero de repeticiones no puede ser negativo");
        } else {
            System.out.println("Despues de repetir " + veces + " veces: " + repetir(texto, veces));
        }
        entrada.close();
    }
}
