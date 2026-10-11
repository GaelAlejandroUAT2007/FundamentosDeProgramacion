import java.util.Scanner;

public class Tarea011_022 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int obtenerLongitud(String texto) {
        return texto.length();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La longitud de la cadena '" + texto + "' es: " + obtenerLongitud(texto));
        entrada.close();
    }
}
