import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_30
 *
 * Enunciado: Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class Tarea05_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0;

        System.out.println("Introduzca un número N:");
        n = sc.nextInt();
        if (n < 1) {
            System.out.println("N debe ser mayor o igual que 1");
        } else {
            for (i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
