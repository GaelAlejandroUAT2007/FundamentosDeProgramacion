import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_07
 *
 * Enunciado: Pedir dos números y decir cuál es el mayor.
 */
public class Tarea05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n1 = 0, n2 = 0;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número:");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("El mayor es: " + n1);
        } else {
            System.out.println("El mayor es: " + n2);
        }

        sc.close();
    }
}
