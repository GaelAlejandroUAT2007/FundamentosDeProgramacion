import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_004 {

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

    static int contarPuntosCodigo(String texto, int inicio, int fin) {
        return texto.codePointCount(inicio, fin);
    }

    static void mostrarResultado(String texto, int cantidad) {
        System.out.println("Cadena original : " + texto);
        System.out.println("Cantidad de puntos de codigo = " + cantidad);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int inicio;
        int fin;
        do {
            inicio = leerEntero(entrada, "Ingrese el indice inicial: ");
            fin = leerEntero(entrada, "Ingrese el indice final (exclusivo): ");
            if (!rangoValido(texto, inicio, fin)) {
                System.out.println("Rango invalido. Intente de nuevo.");
            }
        } while (!rangoValido(texto, inicio, fin));
        mostrarResultado(texto, contarPuntosCodigo(texto, inicio, fin));
        entrada.close();
    }
}
