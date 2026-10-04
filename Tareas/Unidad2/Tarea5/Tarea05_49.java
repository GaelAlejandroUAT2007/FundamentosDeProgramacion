import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_49
 *
 * Enunciado: Dibuja un cuadrado de n elementos de lado utilizando *.
 */
public class Tarea05_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0, j = 0;

        System.out.println("Introduzca el lado del cuadrado:");
        n = sc.nextInt();
        if (n < 1) {
            System.out.println("El lado debe ser mayor o igual que 1");
        } else {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }

        sc.close();
    }
}
