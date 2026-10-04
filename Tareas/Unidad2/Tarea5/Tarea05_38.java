import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_38
 *
 * Enunciado: Pedir un número (que debe estar entre 0 y 10) y mostrar la tabla de
 * multiplicar de dicho número.
 */
public class Tarea05_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0;

        System.out.println("Introduzca un número entre 0 y 10:");
        n = sc.nextInt();
        if (n < 0 || n > 10) {
            System.out.println("El número debe estar entre 0 y 10");
        } else {
            for (i = 1; i <= 10; i++) {
                System.out.println("" + n + " x " + i + " = " + (n * i));
            }
        }

        sc.close();
    }
}
