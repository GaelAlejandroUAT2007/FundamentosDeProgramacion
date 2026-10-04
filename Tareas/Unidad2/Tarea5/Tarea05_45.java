import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_45
 *
 * Enunciado: Pedir 5 números e indicar si alguno es múltiplo de 3.
 */
public class Tarea05_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, n = 0;
        boolean hay = false;

        hay = false;
        for (i = 1; i <= 5; i++) {
            System.out.println("Introduzca el número " + i + ":");
            n = sc.nextInt();
            if (n % 3 == 0) {
                hay = true;
            }
        }
        if (hay) {
            System.out.println("Hay al menos un múltiplo de 3");
        } else {
            System.out.println("Ningún número es múltiplo de 3");
        }

        sc.close();
    }
}
