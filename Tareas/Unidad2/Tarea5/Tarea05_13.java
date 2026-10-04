import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_13
 *
 * Enunciado: Pedir un número entre 0 y 9.999 y decir si es capicúa.
 */
public class Tarea05_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, u = 0, d = 0, c = 0, m = 0;
        boolean cap = false;

        System.out.println("Introduce un número entre 0 y 9999:");
        n = sc.nextInt();
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            u = n % 10;
            d = (n / 10) % 10;
            c = (n / 100) % 10;
            m = n / 1000;
            cap = false;
            if (n < 10) {
                cap = true;
            } else if (n < 100) {
                cap = (d == u);
            } else if (n < 1000) {
                cap = (c == u);
            } else {
                cap = (m == u && c == d);
            }
            if (cap) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número NO es capicúa");
            }
        }

        sc.close();
    }
}
