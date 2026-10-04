import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_26
 *
 * Enunciado: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números
 * se han introducido.
 */
public class Tarea05_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, cont = 0;

        cont = 0;
        System.out.println("Introduzca un número (negativo para terminar):");
        n = sc.nextInt();
        while (n >= 0) {
            cont = cont + 1;
            System.out.println("Introduzca un número (negativo para terminar):");
            n = sc.nextInt();
        }
        System.out.println("Números introducidos: " + cont);

        sc.close();
    }
}
