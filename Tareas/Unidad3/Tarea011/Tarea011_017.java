import java.util.Arrays;
import java.util.Scanner;

public class Tarea011_017 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char[] obtenerArreglo(String texto) {
        return texto.toCharArray();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char[] arreglo = obtenerArreglo(texto);
        System.out.println("La referencia del arreglo de caracteres es \"" + arreglo + "\"");
        System.out.println("Contenido del arreglo: " + Arrays.toString(arreglo));
        System.out.println("Cadena reconstruida: " + String.valueOf(arreglo));
        entrada.close();
    }
}
