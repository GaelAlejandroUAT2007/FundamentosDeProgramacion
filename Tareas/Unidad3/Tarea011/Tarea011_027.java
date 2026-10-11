import java.util.Scanner;

public class Tarea011_027 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static boolean rangoValido(String texto, int inicio, int fin) {
        return inicio >= 0 && fin <= texto.length() && inicio <= fin;
    }

    static String extraerSubcadena(String texto, int inicio, int fin) {
        return texto.substring(inicio, fin);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
