import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_11
 *
 * Enunciado: Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
 */
public class Tarea05_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, c = 0;

        System.out.println("Introduce un número entre 0 y 9999:");
        n = sc.nextInt();
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            if (n < 10) {
                c = 1;
            } else if (n < 100) {
                c = 2;
            } else if (n < 1000) {
                c = 3;
            } else {
                c = 4;
            }
            System.out.println("Cantidad de cifras: " + c);
        }

        sc.close();
    }
}
