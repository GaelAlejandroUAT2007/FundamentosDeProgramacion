import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_023 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static boolean coincideRegion(String primera, int inicio1, String segunda, int inicio2, int longitud) {
        return primera.regionMatches(inicio1, segunda, inicio2, longitud);
    }

    static void mostrarResultado(int inicio1, int inicio2, int longitud, boolean resultado) {
        System.out.println("cadena1[" + inicio1 + " - " + (inicio1 + longitud) + "] == cadena2["
                + inicio2 + " - " + (inicio2 + longitud) + "]? " + resultado);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la cadena 1: ");
        String segunda = leerTexto(entrada, "Ingrese la cadena 2: ");
        int cantidad = leerEntero(entrada, "Cuantas regiones desea comparar: ");
        for (int i = 1; i <= cantidad; i++) {
            int inicio1 = leerEntero(entrada, "Region " + i + " - inicio en cadena 1: ");
            int inicio2 = leerEntero(entrada, "Region " + i + " - inicio en cadena 2: ");
            int longitud = leerEntero(entrada, "Region " + i + " - longitud: ");
            mostrarResultado(inicio1, inicio2, longitud, coincideRegion(primera, inicio1, segunda, inicio2, longitud));
        }
        entrada.close();
    }
}
