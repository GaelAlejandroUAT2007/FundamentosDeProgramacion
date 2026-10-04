import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_12
 *
 * Enunciado: Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 */
public class Tarea05_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, u = 0, d = 0, c = 0, m = 0;

        System.out.println("Introduce un número entre 0 y 9999:");
        n = sc.nextInt();
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            u = n % 10;
            d = (n / 10) % 10;
            c = (n / 100) % 10;
            m = n / 1000;
            System.out.println("Con las cifras al revés: " + u + d + c + m);
        }

        sc.close();
    }
}
