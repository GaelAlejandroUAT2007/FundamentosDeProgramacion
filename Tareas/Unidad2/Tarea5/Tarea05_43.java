import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_43
 *
 * Enunciado: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
public class Tarea05_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, n = 0;
        boolean hay = false;

        hay = false;
        for (i = 1; i <= 10; i++) {
            System.out.println("Introduzca el número " + i + ":");
            n = sc.nextInt();
            if (n < 0) {
                hay = true;
            }
        }
        if (hay) {
            System.out.println("Sí se introdujo algún número negativo");
        } else {
            System.out.println("No se introdujo ningún número negativo");
        }

        sc.close();
    }
}
