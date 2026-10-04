import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_04
 *
 * Enunciado: Pedir dos números y decir si son iguales o no.
 */
public class Tarea05_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n1 = 0, n2 = 0;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número:");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        sc.close();
    }
}
