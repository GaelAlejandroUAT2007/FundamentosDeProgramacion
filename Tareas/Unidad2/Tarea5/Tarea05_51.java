import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_51
 *
 * Enunciado: Realizar un programa que nos pida un número n, y nos diga cuántos números
 * hay entre 1 y n que son primos.
 */
public class Tarea05_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0, j = 0, cont = 0;
        boolean esPrimo = false;

        System.out.println("Introduzca un número n:");
        n = sc.nextInt();
        cont = 0;
        for (i = 2; i <= n; i++) {
            esPrimo = true;
            j = 2;
            while (j * j <= i && esPrimo) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                j = j + 1;
            }
            if (esPrimo) {
                cont = cont + 1;
            }
        }
        System.out.println("Entre 1 y " + n + " hay " + cont + " números primos");

        sc.close();
    }
}
