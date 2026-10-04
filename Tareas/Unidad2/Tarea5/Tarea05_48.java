import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_48
 *
 * Enunciado: Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */
public class Tarea05_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int t = 0, i = 0;

        for (t = 1; t <= 10; t++) {
            System.out.println("Tabla del " + t);
            for (i = 1; i <= 10; i++) {
                System.out.println("" + t + " x " + i + " = " + (t * i));
            }
        }

        sc.close();
    }
}
