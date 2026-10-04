import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_23
 *
 * Enunciado: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
 * introduzca un número negativo.
 */
public class Tarea05_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, c = 0;

        System.out.println("Introduzca un número (negativo para terminar):");
        n = sc.nextInt();
        while (n >= 0) {
            c = n * n;
            System.out.println("El cuadrado de " + n + " es " + c);
            System.out.println("Introduzca un número (negativo para terminar):");
            n = sc.nextInt();
        }
        System.out.println("Fin del programa");

        sc.close();
    }
}
