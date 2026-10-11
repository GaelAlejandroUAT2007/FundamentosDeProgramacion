import java.util.Scanner;

public class Tarea011_009 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean sonIguales(String cadena, CharSequence secuencia) {
        return cadena.contentEquals(secuencia);
    }

    static void mostrarComparacion(String cadena, String secuencia) {
        System.out.println("Comparando " + cadena + " y " + secuencia + ": " + sonIguales(cadena, secuencia));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String referencia = leerTexto(entrada, "Ingrese la secuencia de referencia: ");
        String primera = leerTexto(entrada, "Ingrese la primera cadena a comparar: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena a comparar: ");
        mostrarComparacion(primera, referencia);
        mostrarComparacion(segunda, referencia);
        entrada.close();
    }
}
