import java.util.Scanner;

public class Tarea011_007 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String concatenar(String primera, String segunda) {
        return primera.concat(segunda);
    }

    static void mostrarResultado(String primera, String segunda, String resultado) {
        System.out.println("Cadena 1: " + primera);
        System.out.println("Cadena 2: " + segunda);
        System.out.println("La cadena concatenada: " + resultado);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la cadena 1: ");
        String segunda = leerTexto(entrada, "Ingrese la cadena 2: ");
        mostrarResultado(primera, segunda, concatenar(primera, segunda));
        entrada.close();
    }
}
