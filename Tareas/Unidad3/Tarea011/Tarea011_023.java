import java.util.Scanner;

public class Tarea011_023 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static boolean coincideRegion(String primera, int inicio1, String segunda, int inicio2, int longitud) {
        return primera.regionMatches(inicio1, segunda, inicio2, longitud);
    }

    static void mostrarResultado(int inicio1, int inicio2, int longitud, boolean resultado) {
        System.out.println("cadena1[" + inicio1 + " - " + (inicio1 + longitud) + "] == cadena2["
                + inicio2 + " - " + (inicio2 + longitud) + "]? " + resultado);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
