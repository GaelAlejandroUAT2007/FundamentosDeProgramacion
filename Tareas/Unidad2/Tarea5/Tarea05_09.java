import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_09
 *
 * Enunciado: Pedir dos números y mostrarlos ordenados de mayor a menor.
 */
public class Tarea05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int a = 0, b = 0, aux = 0;

        System.out.println("Introduce un número:");
        a = sc.nextInt();
        System.out.println("Introduce otro número:");
        b = sc.nextInt();
        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println("De mayor a menor: " + a + " " + b);

        sc.close();
    }
}
