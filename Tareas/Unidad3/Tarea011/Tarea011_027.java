import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_027 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static boolean rangoValido(String texto, int inicio, int fin) {
        return inicio >= 0 && fin <= texto.length() && inicio <= fin;
    }

    static String extraerSubcadena(String texto, int inicio, int fin) {
        return texto.substring(inicio, fin);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int inicio;
        int fin;
        do {
            inicio = leerEntero(entrada, "Posicion inicial: ");
            fin = leerEntero(entrada, "Posicion final (exclusiva): ");
            if (!rangoValido(texto, inicio, fin)) {
                System.out.println("Rango invalido. Intente de nuevo.");
            }
        } while (!rangoValido(texto, inicio, fin));
        System.out.println("antes = " + texto);
        System.out.println("despues = " + extraerSubcadena(texto, inicio, fin));
        entrada.close();
    }
}
