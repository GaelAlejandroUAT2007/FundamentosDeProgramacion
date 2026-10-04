import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_08
 *
 * Enunciado: Pedir dos números y decir cuál es el mayor o si son iguales.
 */
public class Tarea05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n1 = 0, n2 = 0;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número:");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los números son iguales");
        } else if (n1 > n2) {
            System.out.println("" + n1 + " es mayor que " + n2);
        } else {
            System.out.println("" + n2 + " es mayor que " + n1);
        }

        sc.close();
    }
}
